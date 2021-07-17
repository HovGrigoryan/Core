package hometask;

public class CharArray {

    void trim(char[] array) {
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ') {
                break;
            }
            count1++;
        }

        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] != ' ') {
                break;
            }
            count2++;
        }

        char info[] = new char[array.length - count1 - count2];

        int index = 0;

        for (int i = 0; i < array.length; i++) {

            if (i < count1) {
                continue;
            }

            if (index == info.length) {
                break;
            }

            info[index] = array[i];
            index++;
        }

        for (char x : info) {
            System.out.print(x);
        }
    }

    void printCount(char[] array, char symbol) {
        char c = symbol;
        int y = 0;
        for (char i : array)
            if (i == c) {
                y++;

            }
        System.out.println(y);
    }

    void middleTwo(char[] array) {
        System.out.print(array[array.length / 2] + " ");
        System.out.println(array[array.length / 2 - 1]);
    }

    void printLy(char[] array) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            a++;
            if (a == array.length) {
                if (array[i] == 'l' || array[i] == 'y') {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                    break;
                }
            }


        }
    }

    void bobThere(char[] array) {
        boolean b = false;
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == 'b' && array[i + 2] == 'b') {
                b = true;
                break;
            }
        }
        System.out.println(b);
    }

    void printReversed(char[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);

        }
        System.out.println();
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
        System.out.println(array);


    }

    void MixArrays(char[] array1, char[] array2) {

        int aLen = array1.length;
        int bLen = array2.length;
        int max = aLen > bLen ? aLen : bLen;
        for (int i = 0; i < max; i++) {
            if (i < aLen) {
                System.out.print(array1[i]);
            }
            if (i < bLen) {
                System.out.print(array2[i]);
            }
        }

        System.out.println();
    }

    void repeatEnd(char[] array, int n) {
        int x = array[array.length - 1];
        for (int i = 0; i < n; i++) {
            System.out.print((char) x);
        }
        System.out.println();
    }

    void endOrFront(char[] array, boolean b) {
        if (b) {
            System.out.println(array[0]);
        } else {
            System.out.println(array[array.length - 1]);
        }
    }

}