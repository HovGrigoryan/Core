package chapter13.io;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\io\\folder2\\file4.txt");
        if (!file.exists()) {
//            file.mkdirs();
            boolean isCreated = file.createNewFile();
            if (isCreated) {
                System.out.println("File was created");
            } else {
                System.out.println("File was not created");
            }
        }

        System.out.println("exist: " + file.exists());
        System.out.println("isDirectory: " + file.isDirectory());
        System.out.println("isFile: " + file.isFile());
//        System.out.println("length: " + file.length());
////        String fl =file.getName();
////        String fle[] = fl.split(".");
////        System.out.println(fle[0]);
//        System.out.println("getname: " + file.getName());
//        System.out.println("isAbsolute : " + file.isAbsolute());
//        file = new File("D:\\io");
//        File[] list = file.listFiles();
//        for (File s : list) {
//            String directory = s.isDirectory() ? "folder" : "file";
//            System.out.println(s.getName() + " - " + directory);

    }

}
