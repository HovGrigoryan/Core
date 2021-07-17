package chapter8examples.example5;

public class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.callme();
        b.callme();
        c.callme();
//        A r;
//        r=a;
//        r.callme();
//
//        r=b;
//        b.callme();
//
//        r=c;
//        c.callme();
    }
}
