package itmo.java.labs.task6;

import java.util.Scanner;

public class ParentFiveClass implements PrintableFive {
    private Integer ageUser;
    private String name;

    public ParentFiveClass(String name) {
        this.name = name;
        this.ageUser = new Scanner(System.in).nextInt();
        printAgeUser();
    }

    public void setAgeUser(Integer ageUser) {
        this.ageUser = ageUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printAgeUser() {
        System.out.println(ageUser);
    }
}
