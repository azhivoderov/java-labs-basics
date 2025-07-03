package itmo.java.labs.task10;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        //1
        File file = new File("file1.txt");
        File file2 = new File("file2.txt");
//        System.out.println(ReadWriteFile.readFile(file));
//
//        //2
//        ReadWriteFile.addFile(file, "123");
//
//        //3
//        ReadWriteFile.unificationFiles(file, file2);

        //4
        ReadWriteFile.checkFile(file2,"$");
    }
}
