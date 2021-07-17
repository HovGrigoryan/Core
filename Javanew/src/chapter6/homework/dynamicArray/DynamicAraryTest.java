package chapter6.homework.dynamicArray;

public class DynamicAraryTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);
        da.add(3);
        da.add(4);
        da.add(5);
        da.add(6);
        da.add(7);
        da.add(8);
        da.add(9);
        da.add(10);
        da.deleteByIndex(2);
        da.print();
        System.out.println();
        //test max
        System.out.println("MAX - " + da.max());
        //test min
        System.out.println("MIN - " + da.min());
//
//        da.deleteByIndex(3);
//        da.print();
//        da.deleteByValue(7);
//        da.deleteByValueFirst(3);
//        da.print();
        int[] nums = da.subArray(3, 9);
        for (int num : nums) {
            System.out.println(num);
        }
        int[] nums1 = da.subArray(3);
        for (int num : nums1) {
            System.out.println(num);
        }
    }
}
