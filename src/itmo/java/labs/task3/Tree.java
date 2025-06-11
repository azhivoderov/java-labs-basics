package itmo.java.labs.task3;

public class Tree {
    private Integer age;
    private boolean itsLive;
    private String name;

    public Tree(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(Integer age, boolean itsLive, String name) {
        this.age = age;
        this.itsLive = itsLive;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", itsLive=" + itsLive +
                ", name='" + name + '\'' +
                '}';
    }
}
