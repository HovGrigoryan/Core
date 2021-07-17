package chapter11.example4;

public class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        t.start();

    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "interrupted");
        }
        System.out.println(name + "Finished");
    }
}

class MultiThreadDemo{
    public static void main(String[] args) {
        new NewThread("one");
        new NewThread("two");
        new NewThread("three");
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("The main Thread is Interrupted");
        }
        System.out.println("The main Thread is finished");
    }
}
