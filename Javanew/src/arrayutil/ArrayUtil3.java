package arrayutil;

import example.IfSample;

public class ArrayUtil3 {
    public static void main(String[] args) {
        int array[] = {7, 6, 5, 4, 47, 12, 47, 39, 22, 14};
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];

            }
        }
        System.out.println(minValue);

    }
}
