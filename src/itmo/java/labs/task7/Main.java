package itmo.java.labs.task7;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Plane.InnerWing wing1 = new Plane.InnerWing(15000);
        Plane.InnerWing wing2 = new Plane.InnerWing(23000);

        wing1.printWeight();
        wing2.printWeight();

    }
}
