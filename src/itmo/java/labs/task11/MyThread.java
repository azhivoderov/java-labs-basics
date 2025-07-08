package itmo.java.labs.task11;

public class MyThread extends Thread {
    Integer quantity;

    public MyThread(Integer quantity) {
        this.quantity = quantity;
        this.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < quantity; i++) {
            System.out.println(i);
        }
    }
}
