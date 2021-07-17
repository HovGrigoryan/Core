package chapter7.examples.homework;

public class BraceChekerTest {
    public static void main(String[] args) {
        String text = "Hello (from [Java] )";
        BraceCheker braceCheker = new BraceCheker(text);
        braceCheker.check();
//        braceChecker.check();
//        System.out.println("Error: opened [ but closed } at 20");
    }
}
