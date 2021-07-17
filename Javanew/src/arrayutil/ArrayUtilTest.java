package arrayutil;

import homework.massiv.Array;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] array = {9, 5, 9, -3, 4, 7, 10, 2, 34, 22};
        ArrayUtil au = new ArrayUtil();
        au.print(array);
        System.out.println();

        au.printMax(array);

        au.printMin(array);

        au.printEvens(array);
        System.out.println( );

        au.printCountOfEvens(array);
        System.out.println();

        au.printCountOfOdds(array);
        System.out.println();

        au.printSum(array);

        au.printAvg(array);


//        int [] arr = { 12, 34,34 ,21};
//        int[] arr1 = {32,23,34,13};
//        ArrayUtil au8 = new ArrayUtil();
//        au8.printAvg(arr);
//        System.out.println(arr);
//
//        ArrayUtil au9 = new ArrayUtil();
//        au9.printSum(arr1);
    }





}
