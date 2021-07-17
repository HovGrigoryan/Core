package homework;
/**
 * Գրել կոդ, որը կպատկերի այս եռանկյունը։
 *
 *
 *        *
 *       * *
 *      * * *
 *     * * * *
 *      * * *
 *       * *
 *        *
 * */
public class Five {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");

            }
            System.out.println();
        }
        for (int d = 3; d > 0; d--) {

            for (int e = 4; e > d; e--) {
                System.out.print(" ");

            }
            for (int f = 0; f < d; f++) {
                System.out.print(" *");
            }
            System.out.println();


        }

    }
}