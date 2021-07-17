package hometask;

public class Task0 {
    public static void main(String[] args) {
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', 'o', 'o'};

        for (int i = 0; i < text.length; i++) {
            if (text[i] ==' ') {
               continue;

            }
            char[] result = new char[7];
            for (int j = 0; j<result.length ; j++) {
                result[j]=text[i];

            }
            System.out.print(result[i]);
        }

    }


}
