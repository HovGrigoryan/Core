package chapter7.examples.example1;

public class OverLoadDemo {
    void test(){
        System.out.println("empty");
    }
    void test (int a){
        System.out.println("a:" + a);
    }
    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }
    double test (double a){
        System.out.println(" double a:" + a);
        return a*a;
    }
//
//
//    void test() {
//        System.out.println("emty");
//    }
//
//    void test(int a, int b) {
//        System.out.println("a and b " + a + " " + b);
//    }
//    void test (double a){
//        System.out.println("test(double) a:" + a);
//    }
}
