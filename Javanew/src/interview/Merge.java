package interview;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        concatSortedMassive(new int[]{5,8,7}, new int[]{2,7,9});
    }
    public static void concatSortedMassive(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int currentSize = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[currentSize++] = arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[currentSize++] = arr2[i];
        }
        Arrays.sort(arr3);
        for (int i : arr3) {
            System.out.print(i+" ");
        }




    }
}
