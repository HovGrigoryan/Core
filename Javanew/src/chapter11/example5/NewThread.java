package chapter11.example5;

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
            System.out.println(name + " Interrupted");
        }
        System.out.println(name + " finished");
    }
}


class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("one");
        NewThread ob2 = new NewThread("two");
        NewThread ob3 = new NewThread("three");

        System.out.println("Thread the first is beginning: " + ob1.t.isAlive());
        System.out.println("Thread the second is beginning: " + ob2.t.isAlive());
        System.out.println("Thread the third is beginning: " + ob3.t.isAlive());

        try {
            System.out.println("wait for finishing Threads");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("The main Thread is interrupted");
        }
        System.out.println("Thread the first is beginning: " + ob1.t.isAlive());
        System.out.println("Thread the second is beginning: " + ob2.t.isAlive());
        System.out.println("Thread the third is beginning: " + ob3.t.isAlive());
        System.out.println("The main Thread is finished");
    }
}
