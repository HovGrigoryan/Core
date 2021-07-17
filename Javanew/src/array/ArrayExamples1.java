package array;

public class ArrayExamples1 {
    public static void main(String[] args) {
        int[] array = {12, 78,44, 25, 78, -7, 2, 7, 55, 93};
        boolean a = false;
        int x = 44;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                a = true;
            }
        }
        System.out.println(a);


    }
}


