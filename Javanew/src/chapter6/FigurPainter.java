package chapter6;

public class FigurPainter {


    public void figureOne(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void figureTwo(int m, char l) {
        for (int i = 0; i < m; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(l);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void figureThree() {
        for (int i = 4; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void figureFour() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    void figureFive(int f,char d) {
        for (int i = 0; i < f; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(d);
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
                System.out.print(d);

            }
            System.out.println();
        }
    }

}

