package itmo.java.labs.task10;

import java.io.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static java.awt.SystemColor.text;

public class ReadWriteFile {

    public static Set<String> readFile(File file){
        String str;

        if(!file.exists() && file.isDirectory()) {
            return null;
        }

        Set<String> strings = new LinkedHashSet<>();
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

}
