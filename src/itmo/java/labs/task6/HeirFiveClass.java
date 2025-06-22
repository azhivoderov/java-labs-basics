package itmo.java.labs.task6;

public class HeirFiveClass extends ParentFiveClass implements PrintableFive{
    public HeirFiveClass(String name) {
        super(name);
    }

    @Override
    public void printAgeUser() {
        System.out.println(this.getName());
    }

}
