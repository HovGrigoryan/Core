package chapter11.example2;

public class NewThread implements Runnable {
    Thread t;
    NewThread (){
        t = new Thread(this,"Daughter Thread");
        System.out.println("Daughters Thread is done: " + t);
        t.start();
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


class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();
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



