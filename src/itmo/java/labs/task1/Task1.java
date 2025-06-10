package itmo.java.labs.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    // 1
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");

    // 2
        System.out.println((46 + 10)*(10 / 3d));
        System.out.println(29 * 4 * -15);

    // 3
    int number = 10500;
    double result = number / 10d / 10d;
        System.out.println(result);

    // 4
    result = 3.6 * 4.1 * 5.9;

    // 5
    Scanner scanner = new Scanner(System.in);
    int s1 = scanner.nextInt();
    int s2 = scanner.nextInt();
    int s3 = scanner.nextInt();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    // 6
    int b = scanner.nextInt();
    // вариант 1
        System.out.println(b % 2 != 0 ? "Нечетное" : b > 100 ? "Выход за пределы диапазона" :"Четное");

    // вариант 2
        if (b % 2 != 0) {
        System.out.println("Нечетное");
    } else if (b > 100){
        System.out.println("Выход за пределы диапазона");
    } else {
        System.out.println("Четное");
    }

}
}
