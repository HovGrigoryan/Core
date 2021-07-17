package chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42/a;
        }catch (ArithmeticException e){
            System.out.println("@ndhanur class");
        }catch (Exception e){
            System.out.println("kkk");
        }
    }
}
