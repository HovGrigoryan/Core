package array;

public class ArrayExamples5 {
    public static void main(String[] args) {
        int[] array = {12, 55, 44, 25, 78, -7, 2, 7, 55, 93};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                   if (array[i] > array[j]) {
                    int value = 0;
                    value = array[i];
                    array[i] = array[j];
                    array[j] = value;


                }


            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
