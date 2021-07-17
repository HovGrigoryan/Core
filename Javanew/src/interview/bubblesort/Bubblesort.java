package interview.bubblesort;

public class Bubblesort {

    public static void main(String[] args) {
        bubbleSort(new int[ ] {11,7,9,10,24,2,11,21});
    }

    public static void bubbleSort(int[] a) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
