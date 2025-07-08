package itmo.java.labs.task11;

import java.util.concurrent.CountDownLatch;

public class CounterThread extends Thread {
    Counter counter;
    Integer countOperation;
    CountDownLatch countDownLatch;

    @Override
    public void run() {
        for (int i = 0; i < countOperation; i++) {
                counter.increment();
        }
        countDownLatch.countDown();
    }

    public CounterThread(Counter counter, Integer countOperation, CountDownLatch countDownLatch ) {
        this.counter = counter;
        this.countOperation = countOperation;
        this.countDownLatch = countDownLatch;
        this.start();
    }

}
