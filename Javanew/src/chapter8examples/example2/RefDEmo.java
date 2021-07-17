package chapter8examples.example2;

public class RefDEmo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(1, 1, 1, 2.0);
        Box plainbox = new Box();
        double vol;

        vol=weightbox.volume();
        System.out.println(vol);
        System.out.println(weightbox.weight);
        System.out.println();

        plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println(vol);
    }
}
