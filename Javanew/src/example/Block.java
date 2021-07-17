package example;

public class Block {
    public static void main(String[] args) {
        int x,y;
        y = 20;
        for (x=0;x<10;x++) {
            System.out.println("x value is" + x);
            System.out.println("y value is" + y);
            y = y - 2;
        }
    }
}
