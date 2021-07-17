package classwork.homework.charutil;

public class CharArrayUtilTest {

    public static void main(String[] args) {
        char[] a = {'a', 'b', 'b', 't', 'o','k','u','k'};
        char[] b = {'z', 'x', 'c', 'v', 'n'};
        CharArrayUtil charArrayUtil = new CharArrayUtil();
        charArrayUtil.printReversed(a);
        System.out.println();
        charArrayUtil.reverseAndPrint(a);
        System.out.println();
        charArrayUtil.endOrFront(a, false);
        System.out.println();
        charArrayUtil.mixArrays(a, b);
        System.out.println();
        charArrayUtil.repeatEnd(a, 3);
    }
}
