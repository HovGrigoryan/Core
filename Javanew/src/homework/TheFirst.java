package homework;

public class TheFirst {
    public static void main(String[] args) {
        /**
         * Գրել կոդ, որը կպատկերի այս եռանկյունը։
         *
         *      *
         *      * *
         *      * * *
         *      * * * *
         *
         * */
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
