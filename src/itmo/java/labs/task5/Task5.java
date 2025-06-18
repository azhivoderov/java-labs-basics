package itmo.java.labs.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

    public static String maxLength(String s) {
        String maxString = "";
        int maxLength = 0;
        if ((s == null) || s.isEmpty()) {
            return maxString;
        }
        String[] strings = s.split("\\s");
        for (int i = 0; i < strings.length; i++) {
            if (maxLength < strings[i].length()) {
                maxLength = strings[i].length();
                maxString = strings[i];
            }
        }
        return maxString;
    }

    public static boolean isPalindrome(String text) {
        if ((text == null) || text.isEmpty()) {
            return false;
        }

        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.reverse();

        return text.equalsIgnoreCase(stringBuilder.toString());

    }

    public static String checkByaka(String text, String oldSubString, String newSubString) {
        if ((text == null) || text.isEmpty()) {
            return "";
        }

        text = text.replace(oldSubString, newSubString);

        return text;
    }

    public static int countSubString(String text, String subString) {
        int i = 0;
        if ((text == null) || text.isEmpty()) {
            return i;
        }

        Pattern pattern = Pattern.compile(subString);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            i++;
        }

        return i;
    }

    public static String textRevers(String text) {
        StringBuilder str = new StringBuilder();
        if ((text == null) || text.isEmpty()) {
            return str.toString();
        }
        String[] strings = text.split("\\s");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = new StringBuilder(strings[i]).reverse().toString();
            str.append(strings[i])
                    .append(" ");
        }

        return str.toString();
    }
}
