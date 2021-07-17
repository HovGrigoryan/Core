package chapter10;

public class ThrowDemo7 {
    static void demoproc(){
        try {
            throw new NullPointerException("Demo");
        }catch (NullPointerException e){
            System.out.println("Exception is Demoproc().");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("krknutyun" + e);
        }
    }
}
