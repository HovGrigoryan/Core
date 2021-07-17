package chapter12.example2;

import org.w3c.dom.ls.LSOutput;

public enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo2 {
    public static void main(String[] args) {


        Apple ap;
        System.out.println("In Apple");
        Apple allapless[] = Apple.values();
        for (Apple x : allapless) {
            System.out.println(x);
        }
        System.out.println();
        ap = Apple.valueOf("RedDel");
        System.out.println(ap);
    }
}


