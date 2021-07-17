package chapter10;

public class ThrowsDemo8 {
    static void throwOne() throws IllegalAccessException{
        System.out.println("V thrownOne().");
        throw new IllegalAccessException("Demo");   
    }

    public static void main(String[] args) {
        try {
            throwOne();
        }catch (IllegalAccessException e){
            System.out.println("oshibka " + e);
        }
    }
}
