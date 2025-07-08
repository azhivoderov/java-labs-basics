package itmo.java.labs.task11;

import java.lang.reflect.Executable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
        for (int i = 0; i < 100; i++) {
           new CounterThread(1000);
        }

        System.out.println(counter.getCount());

    }
}
