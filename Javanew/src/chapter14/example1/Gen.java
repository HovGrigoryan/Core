package chapter14.example1;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type T will be " + ob.getClass().getName());
    }

}


class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);

        iOb.showType();
        int v = iOb.getOb();
        System.out.println(" Number! " + v);
        System.out.println();

        Gen<String> strOb = new Gen<String>("Test Generic");
        strOb.showType();

        String str = strOb.getOb();
        System.out.println("Number" + str);
    }
}