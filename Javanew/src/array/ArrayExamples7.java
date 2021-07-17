package array;

public class ArrayExamples7 {
    public static void main(String[] args) {
        int[] array = {12, 55, 93, 25, 78, -7, 93, 7, 55, 93};
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int result = 0;
                    result = array[i];
                    array[i] = array[j];
                    array[j] = result;
                }

            }
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
              if (array[array.length-1] == array[i]){
                  count+=1;
              }
        }

        for (int k = 1; k < array.length - count; k++) {
            if (array[k] > maxValue) {
                maxValue = array[k];

            }

        }
        System.out.print(maxValue + " ");


    }

}




