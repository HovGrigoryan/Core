package chapter8examples.example2;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.4);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 5.5);
        double vol;
        vol = mybox1.volume();
        System.out.println(vol);
        System.out.println(mybox1.weight);

    }
}
