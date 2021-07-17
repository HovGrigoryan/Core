package chapter14.example6;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T>
    Boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }

        }
        return false;
    }


    public static void main(String[] args) {
        Integer nums [] = {1,2,3,4,5};
        if (isIn(2,nums)){
            System.out.println("There is 2 if massiv nums ");
        }
        if (!isIn(7,nums)){
            System.out.println("There is not 7 in nums massiv ");
            System.out.println();
        }

        String strs[] = {"one", "two" , "three"};
        if (isIn("two",strs));
        System.out.println("two there is in massiv strs");
    }
}