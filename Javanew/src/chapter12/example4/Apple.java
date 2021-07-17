package chapter12.example4;

public enum Apple {
    Jonathan, GoldenDel, RedDel,Winesap, Cortland;
}
class EnumDemo4{
    public static void main(String[] args) {
        Apple ap,ap2,ap3;
        System.out.println("poryadok");
        for (Apple a:Apple.values()) {
            System.out.println(a + " " + a.ordinal());
        }
        ap = Apple.RedDel;
        ap2=Apple.GoldenDel;
        ap3 = Apple.RedDel;
        System.out.println();

        if (ap.compareTo(ap2)<0){
            System.out.println(ap + " poqr e " + ap2);
        }
        if (ap.compareTo(ap2)>0) {
            System.out.println(ap + " mec  e " + ap2);
        }
        if (ap.compareTo(ap3)==0) {
            System.out.println(ap + " nuyn texum en" + ap2);
        }
        System.out.println();
        if (ap.equals(ap2)){
            System.out.println(" error! ");
        }
        if (ap.equals(ap3)){
            System.out.println(ap + " havasar e" + ap3);
        }
        if (ap==ap3){
            System.out.println(ap + " == " + ap3);
        }
    }
}

