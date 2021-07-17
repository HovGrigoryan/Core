package chapter7continue.example3massiv;

public class PassArray {
    static void vaTest(int ... v) {
        System.out.print("number arguments: " + v.length + " have ");
        for (int x : v) {
            System.out.print(x + " ");

        }
        System.out.println();
    }




}
