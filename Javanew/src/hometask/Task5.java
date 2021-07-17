package hometask;

public class Task5 {
    public static void main(String[] args) {
        char[] bolola = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean b = false;
        for (int i = 0; i < bolola.length - 2; i++) {
            if (bolola[i] == 'b' && bolola[i + 2] == 'b') {
                b = true;
                break;
            }
        }
        System.out.println(b);
    }
}
