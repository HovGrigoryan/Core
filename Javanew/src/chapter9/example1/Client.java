package chapter9.example1;

public class Client implements Callback  {

    @Override
    public void callback(int a) {
        System.out.println("taash");
    }
    void nonIfaceMath(){
        System.out.println("kokochambo");
    }
}

class TestIface{
    public static void main(String[] args) {
        Callback c = new Client();
        Callback.call();

    }
}



