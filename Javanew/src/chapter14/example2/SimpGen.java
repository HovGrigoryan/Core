package chapter14.example2;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgobj = new TwoGen<Integer, String>(88, "Generic");

        tgobj.showTypes();

        int v = tgobj.getob1();
        System.out.println("Number: " + v);

        String str = tgobj.getob2();
        System.out.println("Number: " + str);
    }
}
