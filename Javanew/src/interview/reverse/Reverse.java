package interview.reverse;

public class Reverse {
    public static void main(String[] args) {
        String s = "Varduhi";
        String s1 = "Hakob";
        writeOpposite(s);
        reversik(s1);
    }

    private static void writeOpposite(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        String string = stringBuilder.reverse().toString();
        System.out.println(string);
    }

    private static void reversik(String s) {
        char[] array = s.toCharArray();
        for (int i = 0, j = array.length - 1; i < array.length / 2 ;
             i++, j--) {
            char count;
            count = array[i];
            array[i] = array[j];
            array[j] = count;
        }
        for (char element : array) {
            System.out.print(element);
        }
    }
}
