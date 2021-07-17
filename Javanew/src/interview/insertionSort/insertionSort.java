package interview.insertionSort;

public class insertionSort {

    public static void main(String[] args) {
        insertionSort(new int [ ] {5,9,4,8});
    }


    private static void insertionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int index = i;
            for (int j = i - 1; j >= 0 && value < arr[j]; j--) {
                arr[j + 1] = arr[j];
                index = j;
            }
            arr[index] = value;
        }
        for (int j : arr) {
            System.out.print(j + " | ");
        }
        System.out.println();
    }





   /* public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= a[j]
            array[j+1] = current;
        }
        for (int i : array) {
            System.out.println(i);
        }

    }*/
}
