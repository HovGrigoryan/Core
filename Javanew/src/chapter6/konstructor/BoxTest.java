package chapter6.konstructor;

public class BoxTest {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,15,20);
        Box mybox2 = new Box(11,18,22);
        double vol;
        vol = mybox1.volume();
        System.out.println("value equal is " + vol);
        vol = mybox2.volume();
        System.out.println("value equal is " + vol);

    }
}
