package array;

public class ArrayExamples2 {
    public static void main(String[] args) {
        int[] array = {12, 78, 44, 25, 78, -7, 2, 7, 55, 93};
        int x = 44;
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 44) {
                result = i;

            }

        }
        System.out.println(result);

    }
}
