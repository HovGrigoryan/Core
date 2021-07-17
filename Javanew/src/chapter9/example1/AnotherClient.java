package chapter9.example1;

public class AnotherClient implements Callback {
    @Override
    public void callback(int a) {
        System.out.println("aaaahaa");

    }
}
class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient b = new AnotherClient();

        c.callback(20);

        c=b;
        c.callback(10);
    }

}
