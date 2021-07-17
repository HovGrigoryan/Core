package chapter3;

import com.sun.org.apache.xpath.internal.objects.XString;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b is equal " + b);
        b = true;
        System.out.println("b is equal " + b);
        if (b){
            System.out.println("code is working ");
        }
        b = false;
        if (b) {
            System.out.println("is not working ");
        }
            System.out.println("10>9 is equal " + (10 > 9));
        char l='\"';
        System.out.println(l);
String d = "\"This is in quotes\"";
        System.out.println(d);
    }
}
