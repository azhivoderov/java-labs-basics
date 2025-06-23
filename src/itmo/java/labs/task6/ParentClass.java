package itmo.java.labs.task6;

import java.util.Scanner;

public abstract class ParentClass {
    private Integer number;

    public ParentClass() {
        this.number = new Scanner(System.in).nextInt();
    }

    public Integer getNumber() {
        return number;
    }

    public void setI(Integer number) {
        this.number = number;
    }

    public abstract void printNumber();
}
