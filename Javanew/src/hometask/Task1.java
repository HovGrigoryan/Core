package hometask;

public class Task1 {
    public static void main(String[] args) {
        char[] text = {' ', ' ', 'b', 'a', 'r',' ',' ', ' ',  'e', 'v', ' ', ' ', ' '};
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                break;
            }
            count1++;
        }

        for (int i = text.length - 1; i > 0 ; i--) {
            if (text[i] != ' ') {
                break;
            }
            count2++;
        }

        char info[] = new char[text.length - count1 - count2];

        int index = 0;

        for (int i = 0; i < text.length; i++) {

            if (i < count1){
                continue;
            }

            if (index == info.length){
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
