package itmo.java.labs.task11;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {

        //1
//        for (int i = 0; i < 10; i++) {
//            new MyThread(100);
//        }

        //2
//        Thread myThread = new Thread(){
//            @Override
//            public void run(){
//               System.out.println(this.getState());
//            }
//        };
//        System.out.println(myThread.getState());
//        myThread.start();
//        System.out.println(myThread.getState());

        //3
        Counter counter = new Counter();
        CountDownLatch countDownLatch = new CountDownLatch(100);
        for (int i = 0; i < 100; i++) {
           new CounterThread(counter,1000, countDownLatch);
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(counter.getCount());

    }
}
