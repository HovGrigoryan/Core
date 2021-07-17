package hometask;

public class Task6 {
    public static void main(String[] args) {
        char[] array1 = {'b', 'a', 'b', 'o', 'l', 'a'};
        char[] array2 = {'b', 'a', 'b', 'o', 'l', 'a', 'b', 'o', 'l', 'a'};
        int index = 0;
        char array3[] = new char[array1.length + array2.length];
        for (int i = 0; i < array2.length; i++) {

            if (i < array1.length) {
                array3[index] = array1[i];
                array3[index + 1] = array2[i];
                index += 2;
            } else {
                array3[index] = array2[i];
                index++;
            }
        }
        for (char x : array3) {
            System.out.print(x + " ");
        }

    }
}

















    









