package chapter6;

public class BoxTest {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();
        double vol;
        myBox.depth = 10;
        myBox.width=5;
        myBox.height=7;

        myBox2.depth=5;
        myBox2.height=7;
        myBox2.width=8;
        vol = myBox.depth * myBox.height * myBox.width;
        System.out.println(vol);

        vol = myBox2.depth * myBox2.height * myBox2.width;
        System.out.println(vol );
    }
}
