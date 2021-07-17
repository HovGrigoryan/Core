package chapter6;

public class BoxTest4 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;
        myBox1.setDim(10, 15, 20);
        myBox2.setDim(3, 6, 9);

        vol = myBox1.volume();
        System.out.println("value is equal " + vol);
        vol = myBox2.volume();
        System.out.print("value is equal " + vol);
    }
}
