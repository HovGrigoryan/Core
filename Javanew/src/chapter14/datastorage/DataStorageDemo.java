package chapter14.datastorage;

public class DataStorageDemo {
    public static void main(String[] args) {
        DataStorage<String> strings = new DataStorage<String>();
        strings.add("Hello");
        strings.add("World");
        strings.add("From");
        strings.add("Home");
//        String a = strings.getByIndex(0);
//        System.out.println(a);    }
        strings.print();
        DataStorage<Integer> nums = new DataStorage<>();
        nums.add(200);
        nums.add(500);
        nums.add(5);
        nums.print();
    }
}
