package itmo.java.labs.task10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.regex.Matcher;

public class ReadWriteFile {

    public static LinkedList<String> readFile(File file){
        String str;

        if(!file.exists() && file.isDirectory()) {
            return null;
        }

        LinkedList<String> strings = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            while ((str = reader.readLine()) != null){
                strings.add(str);
            }
            return strings;
        }catch (IOException e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public static void addFile(File file, String text){
        if(file.exists() && !file.isDirectory()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))){
                writer.append(text);
            }catch (IOException e){
                System.err.println(e.getMessage());
            }
        }
    }

    public static void unificationFiles(File sourceFile, File receiverFile) {

        readFile(receiverFile).forEach(str -> addFile(sourceFile, str+'\n'));

    }

    public static void checkFile(File sourceFile, String str) {

        LinkedList<String> linkedList = readFile(sourceFile);

        try {
            new FileOutputStream(sourceFile, false).close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        if (linkedList != null) {
            for (String s : linkedList) {
                s = s.replaceAll("[^\\p{Alnum} ]", Matcher.quoteReplacement(str));
                addFile(sourceFile, s);
            }
        }
    }
}
