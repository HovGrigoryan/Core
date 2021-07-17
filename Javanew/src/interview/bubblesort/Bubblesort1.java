package interview.bubblesort;

public class Bubblesort1 {

    public static void main(String[] args) {
        bubbleSort(new int[]{7, 11, 9, 10, 24, 2, 11, 21,25});
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }

            }

        }
        for(int value : a){
            System.out.println(value);
        }
    }
}
