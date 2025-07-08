package itmo.java.labs.task11;

public class Counter {
    static int count = 0;

    public static void increment() {
        count = count + 1;
    }
    public int getCount() {
        return count;
    }

}
