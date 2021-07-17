package chapter7continue.homeworkexample;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ներմուծեք ուսանողների քանակը");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.println("Ներմուծեք ուսանողի տվյալները");
            System.out.println("անուն");
            String name = scanner.nextLine();
            System.out.println("ազգանուն");
            String surname = scanner.nextLine();
            System.out.println("տարիք");
            String age = scanner.nextLine();
            System.out.println("հեռ․համար");
            String phone = scanner.nextLine();

            Student student = new Student();
            student.setName(name);
            student.setSurname(surname);
            student.setAge(Integer.parseInt(age));
            student.setPhone(phone);
            System. out.println(student);


        }

//        System.out.println("Ներմուծեք ուսանողի տվյալները");
//        System.out.println("անուն");
//        String name = scanner.nextLine();
//        System.out.println("ազգանուն");
//        String surname = scanner.nextLine();
//        System.out.println("տարիք");
//        String age = scanner.nextLine();
//        System.out.println("հեռ․համար");
//        String phone = scanner.nextLine();
//
//        Student student = new Student();
//        student.setName(name);
//        student.setSurname(surname);
//        student.setAge(Integer.parseInt(age));
//        student.setPhone(phone);
//        System.out.println(student);
//        System.out.println(student);


//        Student student = new Student("poxos", "poxosyan", 20, "+152578");
//        Student student1 = new Student("valod", "valodyan", 20, "+454515");
//        System.out.println(student);
//        System.out.println(student1);
//
//        Student student2 = new Student();
//        student2.setName("petros");
//        student2.setSurname("petrosyan");
//        student2.setAge(25);
//        student2.setPhone("+8979584");
//        System.out.println(student2);


//        System.out.println(student.getName());
//        student.setName("poxosik");
//        System.out.println(student.getName());
//
//        System.out.println(student1.getName());
//        student1.setName("valodik");
//        System.out.println(student1.getName());
//
//        student1.setPhone("13215");
//        System.out.println(student1.getPhone());
    }


}
