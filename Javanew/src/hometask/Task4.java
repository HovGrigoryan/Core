package hometask;

public class Task4 {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a',};
        int a = 0;
        for (int i = 0; i <bolola.length ; i++) {
            a++;
            if (a==bolola.length)
            {
                if (bolola[i] == 'l' || bolola[i] == 'y') {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                    break;
                }
            }


            }
        }
    }

