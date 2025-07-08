package itmo.java.labs.task11;

public class CounterThread extends Thread {
    Integer countOperation;
    @Override
    public void run() {
        for (int i = 0; i < countOperation; i++) {
            synchronized (this){
                Counter.increment();
            }
        }
    }

    public CounterThread(Integer countOperation) {
        this.countOperation = countOperation;
        this.start();
    }

}
