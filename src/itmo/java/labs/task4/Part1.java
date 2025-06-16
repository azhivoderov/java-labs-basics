package itmo.java.labs.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        //1
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        //2
        System.out.print("Делится на 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i);
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("Делится на 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i);
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("Делится на 3 и на 5: ");
        for (int i = 1; i < 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print(i);
                System.out.print(", ");
            }
        }
        System.out.println();

        //3
        System.out.println(method3());

        //4
        System.out.println(method4());

        //5
        int[] array = {3, -3, 7, 4, 5, 4, 3};
        System.out.println(method5(array, 3));

        //6
        System.out.println(method6(array));

    }

    public static boolean method6(int[] array) {
        for (int i : array) {
            if ((i == 1) || (i == 3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean method5(int[] array, int x) {
        System.out.println(Arrays.toString(array));
        if (array.length<2){
            return false;
        }
        return ((array[0] == x) || (array[array.length-1] == x));
    }

    public static boolean method4() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int z = scanner.nextInt();

        return (x < y) && (y < z);
    }

    public static boolean method3(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int z = scanner.nextInt();

        return (x + y) == z;
    }
}
