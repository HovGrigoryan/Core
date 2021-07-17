package chapter8examples.example6;

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10,20);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        System.out.println(f.area());
        System.out.println(r.area());
        System.out.println(t.area());
//        Figure figref;
//        figref =r;
//        System.out.println("1 = " + figref.area());
//        figref =t;
//        System.out.println("1 = " + figref.area());
//        figref =f;
//        System.out.println("1 = " + figref.area());
    }
}
