package chapter13.io.fileExample.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationDemo {

    private static final String FILE_PATH = "E:\\Java\\src\\classwork\\corona05I04_IO\\fileExample\\serialization\\file\\example.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        // WRITE
//        Student student = new Student("Valod", "Valodyan", 24, "valod@gmail.com");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
//
//        objectOutputStream.writeObject(student);
//        objectOutputStream.close();

        // READ
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
//        Object object = objectInputStream.readObject();
//        if (object instanceof Student) {
//            Student student = (Student) object;
//            System.out.println(student);
//        }


        // WRITE and READ from LIST
        Student student = new Student("Valod", "Valodyan", 24, "valod@gmail.com");
        Student student1 = new Student("Valodik", "Valodikyan", 54, "valodikyan@gmail.com");

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
        objectOutputStream.writeObject(students);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
        Object deserialization = objectInputStream.readObject();

        List<Student> st = (List<Student>) deserialization;
        objectInputStream.close();
        for (Student student2 : st) {
            System.out.println(student2);
        }



    }

}
