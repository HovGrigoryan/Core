package classwork.io.fileExample.fileExample;

import java.io.File;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\io\\folder2\\file3.txt");
//        if (!file.exists()) {
////            file.mkdirs();
//            boolean isCreated = file.createNewFile();
//            if (isCreated) {
//                System.out.println("File was created");
//            } else {
//                System.out.println("File was not created");
//            }
//        }
//
//        System.out.println("exists: " + file.exists());
//        System.out.println("isDirectory: " + file.isDirectory());
//        System.out.println("isFile: " + file.isFile());
//        System.out.println("length: " + file.length());
//        System.out.println("getName: " + file.getName());
//        System.out.println("isAbsolute: " + file.isAbsolute());
        file = new File("D:\\io");
        File[] list = file.listFiles();
        for (File s : list) {
            String directory = s.isDirectory() ? "Folder" : "File";
            System.out.println(s.getName() + " - " + directory);
        }

    }

}
