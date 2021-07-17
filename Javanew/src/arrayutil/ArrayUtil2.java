package arrayutil;

public class ArrayUtil2 {
    public static void main(String[] args) {
        int array [] = {7, 6, 5, 4, 47, 12, 47, 39, 22, 14 };
        int maxValue = array [0];

        for (int i = 1; i <array.length ; i++) {
            if (array[i]>maxValue){
                maxValue = array [i];

            }

        }
        System.out.println(maxValue);

    }
}
