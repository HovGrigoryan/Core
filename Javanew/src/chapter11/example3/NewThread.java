package chapter11.example3;

public class NewThread extends Thread {
    NewThread (){
        super("New Thread");
        System.out.println("Daughters thread " + this);
        start();
    }
    public void run(){
        try {
            for (int i = 5; i >0 ; i--) {
                System.out.println("Daughter Thread: " +i);
                Thread.sleep(500);

            }
        }catch (InterruptedException e){
            System.out.println("Daughters Thread is interupted: ");
        }
        System.out.println("Daughters Thread is finished");
    }
}

class ExtendThread {
    public static void main(String[] args) {
       new  NewThread();
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("The main Thread: " + i);
                Thread.sleep(1000);

            }
        }catch (InterruptedException e){
            System.out.println("The main Thread is interrupted");
        }
        System.out.println("The main Thread is finished");
    }
}
