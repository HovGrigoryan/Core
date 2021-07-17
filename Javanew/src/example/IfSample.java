package example;

public class IfSample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x < y){
            System.out.println("x poqr e yic");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("ays depqum x havasar e y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("ays depqum x mec e y");
        }
        if (x == y) {
            System.out.println("duq da cheq tesni");
        }
    }
}