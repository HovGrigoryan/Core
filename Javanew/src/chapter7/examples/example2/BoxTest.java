package chapter7.examples.example2;

import chapter7.examples.example2.Box;

public class BoxTest {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);
        double vol;
        vol = mybox1.volume();
        System.out.println(vol);
        vol = mybox2.volume();
        System.out.println(vol);
        vol = mybox3.volume();
        System.out.println(vol);
    }
}
