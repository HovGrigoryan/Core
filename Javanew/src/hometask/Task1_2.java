package hometask;

public class Task1_2 {
    public static void main(String[] args) {
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ', ' '};
        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                index1 = i;
                break;
            }
        }

        for (int i = text.length - 1; i > 0 ; i--) {
            if (text[i] != ' ') {
                index2 = i;
                break;
            }
        }

        char info[] = new char[index2 - index1 + 1];

        int index = 0;

        for (int i = 0; i < text.length; i++) {

            if (i < index1){
                continue;
            }

            if (i > index2){
                break;
            }

            info[index] = text[i];
            index++;
        }

        for (char x : info) {
            System.out.print(x);
        }
    }
}
