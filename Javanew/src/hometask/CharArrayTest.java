package hometask;

public class CharArrayTest {
    public static void main(String[] args) {
        char[] array11 = {' ', ' ', 'b', 'a', 'r', ' ', ' ', ' ', 'e', 'v', ' ', ' ', ' '};
        CharArray ch1 = new CharArray();
        ch1.trim(array11);
        System.out.println();

        char[] array = {'b', 'o', 'l', 'o', 'l', 'a',};
        CharArray ch = new CharArray();
        ch.trim(array);
        ch.printCount(array, 'l');
        ch.middleTwo(array);
        ch.printLy(array);
        ch.bobThere(array);
        ch.printReversed(array);
        ch.reverseAndPrint(array);
        ch.MixArrays(array, array11);
        ch.repeatEnd(array, 7);
        ch.endOrFront(array, false);


    }


}
