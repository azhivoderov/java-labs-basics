package itmo.java.labs.task11;

import java.util.concurrent.TimeUnit;

public class NewThread extends Thread {
    Boolean flag;
    final Object object;

    public NewThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        while (true){
            synchronized (object){
                try {
                    object.notify();

                    System.out.println(Thread.currentThread().getName());

                    object.wait();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }

            }
        }
    }

}
