package chapter8examples.example3super;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(1,2,3,4.0);
        BoxWeight mybox2 = new BoxWeight(1,2,3,4.0);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube= new BoxWeight(3,2);
//        BoxWeight myclone= new BoxWeight(mybox1);
        double vol;

        vol=mybox1.volume();
        System.out.println("mybox1 = " + vol);
        System.out.println("weight my box1 = " + mybox1.weight );
    }
}
