package chapter6;

public class BoxTest3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.depth = 15;
        mybox1.height = 20;
        mybox1.width = 15;

        mybox2.depth = 9;
        mybox2.height = 6;
        mybox2.width = 9;

        vol = mybox1.volume();
        System.out.println("value is equal " + vol);

        vol = mybox2.volume();
        System.out.println(" value is equal " + vol);

    }
}
