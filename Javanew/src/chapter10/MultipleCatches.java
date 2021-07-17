package chapter10;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = 0;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("bajanum 0");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("sxal massivi mej");
        }
        System.out.println("try/catch-ic heto");
    }
}
