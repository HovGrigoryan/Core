package classwork.homework.charutil;

public class CharArrayUtil {

    void printReversed(char[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }

    void reverseAndPrint(char[] array) {
        int begin = 0;
        int end = array.length - 1;
        char temp;
        while (end > begin) {
            temp = array[begin];
            array[begin] = array[end];
            array[end] = temp;
            end--;
            begin++;
        }
        print(array);
    }

    void mixArrays(char[] a, char[] b) {
        int aLen = a.length;
        int bLen = b.length;
        int max = aLen > bLen ? aLen : bLen;
        for (int i = 0; i < max; i++) {
            if (i < aLen) {
                System.out.print(a[i]);
            }
            if (i < bLen) {
                System.out.print(b[i]);
            }
        }
    }

    void repeatEnd(char[] array, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = array.length-n; j < array.length; j++) {
                System.out.print(array[j]);
            }
        }
    }

    void endOrFront(char[] array, boolean b) {
        if (b) {
            System.out.print(array[0]);
        } else {
            System.out.print(array[array.length - 1]);
        }
    }

    void print(char[] array) {
        for (char c : array) {
            System.out.print(c);
        }
    }
}
