package chapter7.examples.example1;

public class OverLoadTest {
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        double result;
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("ob.test(123.25): " + result);
    }

//    public static void main(String[] args) {
//        OverLoadDemo ob = new OverLoadDemo();
//        int i = 88;
//
//        ob.test();
//        ob.test(10,20);
//        ob.test(i);
//        ob.test(123.2);
//    }
}
