package array;

public class ArrayExamples4 {
    public static void main(String[] args) {
        int[] array = {12, 55, 44, 25, 78, -7, 2, 7, 55, 93};
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[i] == array[j]){
                    System.out.println(array[j]);
                }
                
            }
        }
    }
}
