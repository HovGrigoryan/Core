package chapter14.example5;

import homework.Two;

public class Twod {
    int x, y;

    Twod(int a, int b) {
        x = a;
        y = b;
    }
}

class Threed extends Twod {
    int z;

    Threed(int a, int b, int c) {
        super(a, b);
        z = c;

    }
}

class FourD extends Threed {
    int t;

    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        t = d;
    }
}

class Coords<T extends Twod> {
    T[] coords;

    Coords(T[] o) {
        coords = o;


    }

}

class  BoundedWildcard{
    static void showXY(Coords<?> c){
        System.out.println("Koordinats X Y:");
        for (int i = 0; i <c.coords.length ; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);

        }
        System.out.println();
    }
}
