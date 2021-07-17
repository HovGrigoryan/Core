package chapter8examples.example7abstract;

abstract class A {
    abstract void callme();

    void callmetoo() {
        System.out.println("zzzzzzzzzz");
    }
}

class B extends A {
    void callme() {
        System.out.println("abstraction");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        B b = new B();
        b.callme();
        b.callmetoo();
    }
}