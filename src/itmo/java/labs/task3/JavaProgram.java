package itmo.java.labs.task3;

import itmo.java.labs.task2.Color;

public class JavaProgram {
    public static void main(String[] args) {
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.getCourse());

//        Class Car
        Car car = new Car(Color.GREEN);
        Car car1 = new Car(Color.BLACK, 1745.0);

        System.out.println(car);
        System.out.println(car1);

//        Class Home
        Home home = new Home();
            home.setFloorsCount(14);
            home.setYearOfConstruction(2012);
            home.setName("Широтная 168");
        Home home1 = new Home();
            home1.setFloorsCount(14);
            home1.setYearOfConstruction(2013);
            home1.setName("Широтная 172");

        System.out.println(home);
        System.out.println(home1);

//        Class Tree
        Tree tree = new Tree();
        Tree tree1 = new Tree(20,"Вишня");
        Tree tree2 = new Tree(300,true,"Дуб");

    }
}
