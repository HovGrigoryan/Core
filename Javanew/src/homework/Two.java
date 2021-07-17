package homework;

/**
 * Գրել կոդ, որը կպատկերի այս եռանկյունը։
 *             *
 *           * *
 *         * * *
 *       * * * *
 */
public class Two {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 3 - i; k++) {

                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}


