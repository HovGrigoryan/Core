package chapter8examples.example7abstract;

abstract class Figure {
    double Dim1;
    double Dim2;

    Figure(double a, double b) {
        Dim1 = a;
        Dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("uxxankyun");
        return Dim1 * Dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("erankyun");
        return Dim1 * Dim2 / 2;
    }
}

class AbstractAreas {
    public static void main(String[] args) {

        int array []= new int[10];


        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println(figref.area());

        figref = t;
        System.out.println(figref.area());
    }
}
