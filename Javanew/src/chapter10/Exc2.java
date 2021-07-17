package chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int a,d;

        try{
            d=0;
            a=42/d;
            System.out.println("It isn't working");
        }catch (ArithmeticException e){
            System.out.println("bajanum 0-i." + e);
        }
        System.out.println("After operation catch");
    }
}
