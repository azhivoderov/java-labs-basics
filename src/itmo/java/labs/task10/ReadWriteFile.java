package itmo.java.labs.task10;

import java.io.*;
import java.util.*;

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

    }
}
