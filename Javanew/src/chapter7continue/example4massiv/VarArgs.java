package chapter7continue.example4massiv;

public class VarArgs {
    static void vaTest(String msg,int ... v){
        System.out.print(msg + v.length + " have: ");
        for (int x: v) {
            System.out.print(x + " ");

        }
        System.out.println();
    }
}
