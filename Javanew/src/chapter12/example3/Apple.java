package chapter12.example3;

public enum Apple {
    Jonathan(10),GoldenDel(9), RedDel(),Winesap(15), Cortland(8);

    private int price;

    Apple(int p){
        price =p;
    }
    Apple(){
        price = -1;
    }

    int getPrice(){
        return price;
    }
}

class EnumDemo3{
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Winesap " + Apple.Winesap.getPrice());

        for (Apple x:Apple.values())
            System.out.println(x +  " " + x.getPrice());
        {

        }
        System.out.println(Apple.RedDel.getPrice());
    }
}

