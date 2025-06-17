package itmo.java.labs.task4;

import java.util.Arrays;

import static itmo.java.labs.task4.Part1.*;
import static itmo.java.labs.task4.Part2.*;

public class JavaProgram {
    public static void main(String[] args) {

        //Part1
        //1
        unevenNumbers();

        //2
        div3and5();

        //3
        System.out.println(method3());

        //4
        System.out.println(method4());

        //5
        int[] array = {3, -3, 7, 4, 5, 4, 3};
        System.out.println(method5(array, 3));

        //6
        System.out.println(method6(array));

        //Part2
        //1
        int[] array1 = {1, 2, 3, 1, 2, 4};
        System.out.println(checkArraySortIncrement(array1));

        //2
        System.out.println(createArray());

        //3
        int[] arr = arrayTransformation(array1);

        //4
        findUniqueNumber(array1);

         //5
        System.out.println(Arrays.toString(createArrayRandomAndSort(10)));
    }
}
