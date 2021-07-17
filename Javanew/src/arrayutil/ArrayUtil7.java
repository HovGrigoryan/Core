package arrayutil;

public class ArrayUtil7 {
    public static void main(String[] args) {
        int array[] = {7, 6, 5, 4, 47, 12, 48, 39, 22, 14};
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 !=0) {
                result = result + 1 ;
            }

        }
        System.out.print (result + " ");
    }
}

