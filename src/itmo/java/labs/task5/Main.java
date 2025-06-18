package itmo.java.labs.task5;

import static itmo.java.labs.task5.Task5.*;

public class Main {
    public static void main(String[] args) {

        //1
        String text = "Текст — зафиксированная на бяка-либо материальном носителе человеческая мысль";
        System.out.println(maxLength(text));

        //2
        String text2 = "bТетb";
        System.out.println(isPalindrome(text2));

        //3
        System.out.println(checkByaka(text, "бяка", "[вырезано цензурой]"));

        //4
        System.out.println(countSubString(text, "бяка"));

        //5
        text = "This is a test string";
        System.out.println(textRevers(text));

    }


}
