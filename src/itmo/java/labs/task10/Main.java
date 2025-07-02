package itmo.java.labs.task10;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        //1
        File file = new File("file1.txt");
        System.out.println(ReadWriteFile.readFile(file));

        //2
        ReadWriteFile.addFile(file, "123");

        //3

    }
}
