package chapter8examples.example5;

public class A {
        void callme(){
            System.out.println("class A");
        }
}
class B extends A{
    void callme(){
        System.out.println("class B");
    }

}
class C extends B{
    void callme(){
        System.out.println("class C");
    }
}
