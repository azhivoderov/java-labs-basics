package itmo.java.labs.task6;

public class HeirClass extends ParentClass{

    @Override
    public void printNumber() {
        System.out.println(this.getNumber());
    }
}
