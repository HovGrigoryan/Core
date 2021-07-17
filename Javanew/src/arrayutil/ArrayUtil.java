package arrayutil;

import sun.print.SunMinMaxPage;

public class ArrayUtil {


    void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    void printMax(int [] array1) {
        int maxValue = array1 [0];

        for (int i = 1; i <array1.length ; i++) {
            if (array1[i]>maxValue){
                maxValue = array1 [i];

            }

        }
        System.out.println(maxValue);
    }

    void printMin(int[] array){
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];

            }
        }
        System.out.println(minValue);

    }

    void printEvens(int[]array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");

            }


        }
    }
    void  printCountOfEvens(int [] array){
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result++ ;
            }

        }
        System.out.print (result + " ");
    }
    void printCountOfOdds(int[] array){
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 !=0) {
                result = result + 1 ;
            }

        }
        System.out.print (result + " ");

    }
    void printSum (int []array){
        int result = 0;
        for (int i = 0; i <array.length; i++) {
            result = result + array[i];
        }
        System.out.println(result/array.length);
    }

    void printAvg (int [] array){
        int result = 0;
        for (int i = 0; i <array.length ; i++) {
            result=result + array[i];

        }
        System.out.println(result);
    }


}
