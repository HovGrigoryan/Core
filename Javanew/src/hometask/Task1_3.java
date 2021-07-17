package hometask;

public class Task1_3 {
    public static void main(String[] args) {
            char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ', ' '};
            int count = 0;
            int result = 0;
            for (int i = 0, j=text.length-1; i<j;i++,j--) {
                if (text[i] == ' '){
                    result++;
                }
                if (text[j]==' '){
                    count++;
                }

            }
            char info [] = new char[text.length-result-count];
            int a=0;
            for (int k = 0; k < text.length; k++) {
                if (text[k]!=' ' && a<text.length){
                    info[a]=text[k];
                    a++;
                }
                
            }
            for (char x: info){
                System.out.print(x);
            }
                
            }
    }

