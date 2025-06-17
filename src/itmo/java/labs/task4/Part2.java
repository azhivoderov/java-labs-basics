package itmo.java.labs.task4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Part2 {

    public static String createArray() {
        System.out.print("Array length: ");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        System.out.println("Numbers of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return "Result: " + Arrays.toString(array);
    }

    public static String checkArraySortIncrement(int[] array) {
        if (array.length < 2) {
            return "Length array < 2";
        }
        for (int i = 1; i < array.length; i++) {
           if (array[i-1]>array[i]){
               return "Please, try again";
           }
        }
        return "OK";
    }
    public static String checkArraySortIncrement(double[] array) {
        if (array.length < 2) {
            return "Length array < 2";
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i-1]>array[i]){
                return "Please, try again";
            }
        }
        return "OK";
    }

    public static int[] arrayTransformation(int[] array) {
        System.out.println("Array 1: " + Arrays.toString(array));
        int[] arr = Arrays.copyOfRange(array,0,array.length);
        int n = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = n;
        System.out.println("Array 2: " + Arrays.toString(arr));
        return arr;
    }

    public static void findUniqueNumber(int[] array) {
        if (array.length < 2) {
            return;
        }
        int[] arrayCount = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    arrayCount[i]++;
                }
            }
            if (arrayCount[i] == 1) {
                System.out.println("Первое уникальное число в массиве: "+array[i]);
                break;
            }
        }
    }

    public static int[] createArrayRandomAndSort(int arrayLength) {
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        return arraySort(array);
    }

    public static int[] arraySort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int mid = array.length / 2;
        int[] leftHalf = Arrays.copyOfRange(array,0, mid);
        int[] rightHalf = Arrays.copyOfRange(array, mid, array.length);

        leftHalf = arraySort(leftHalf);
        rightHalf = arraySort(rightHalf);

        return mergeArray(leftHalf, rightHalf);
    }

    public static int[] mergeArray(int[] leftHalf, int[] rightHalf) {
        int[] array = new int[leftHalf.length+rightHalf.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int arrayPointer = 0;

        while ((leftPointer < leftHalf.length) || (rightPointer < rightHalf.length)){
            if ((leftPointer < leftHalf.length) && (rightPointer < rightHalf.length)) {
                if (leftHalf[leftPointer] < rightHalf[rightPointer]) {
                    array[arrayPointer++] = leftHalf[leftPointer++];
                }else {
                    array[arrayPointer++] = rightHalf[rightPointer++];
                }
            } else if (leftPointer < leftHalf.length) {
                array[arrayPointer++] = leftHalf[leftPointer++];
            } else {
                array[arrayPointer++] = rightHalf[rightPointer++];
            }
        }

        return array;
    }
}
