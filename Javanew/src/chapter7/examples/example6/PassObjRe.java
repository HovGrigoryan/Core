package chapter7.examples.example6;

public class PassObjRe {
    public static void main(String[] args) {
        Test ob = new Test(15,20);
        System.out.println("ob.a and ob.b before " + ob.a +  " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after " + ob.a + " " + ob.b);
    }

}
