package chapter12.example1;

public enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("ap will be: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;
        if (ap==Apple.GoldenDel){
            System.out.println("ap will be GoldenDel.\n");
            switch (ap){
                case Jonathan:
                    System.out.println("Jonatan red");
                    break;
                case GoldenDel:
                    System.out.println("Goldendel yellow");
                    break;
                case RedDel:
                    System.out.println("RedDel red");
                    break;
                case Winesap:
                    System.out.println("Winesap purple");
                    break;
                case Cortland:
                    System.out.println("Cprtland green");
            }
        }
    }
}

