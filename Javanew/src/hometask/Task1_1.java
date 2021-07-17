package hometask;

public class Task1_1 {
    public static void main(String[] args) {
        char[] text = {'k', 'k', 'b', 'a', 'r', 'e', 'v', 'k', 'k'};
        char result[] = new char[5];
        int a = 0;
        for (int i = 0; i < text.length; i++) {

                if (text[i] == 'k') {
                    continue;
                } else {
                    if (a < result.length) {
                        result[a] = text[i];
                        a++;

                    }
                }

        }
        for (char x:result){
            System.out.print(x);
        }

    }
}


