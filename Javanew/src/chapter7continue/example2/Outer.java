package chapter7continue.example2;

public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();

    }

    class Inner {
        int y = 100;
        void display() {
            System.out.println("outer_x = " + outer_x);

        }
    }
    void show(){
        Inner inner = new Inner();

        System.out.println(inner.y);
    }
}
