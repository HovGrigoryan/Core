package chapter14.example4;

import java.util.Arrays;

public class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }


    boolean sameAvg(Stats<?> ob) {
        if (average() == ob.average()) {
            return true;
        }
        return false;


    }

}


class WildCardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("Middle iob " + v);

        Double nums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(nums);
        double w = dob.average();
        System.out.println("Middle dob " + w);

        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<Float>(fnums);
        Double x = fob.average();
        System.out.println("Middle fob " + x);

        System.out.println("Middle  iob and dob ");
        if (iob.sameAvg(dob)) {
            System.out.println("equals");
        } else {
            System.out.println("No equals");
        }

        System.out.println("iob and fob");
        if (iob.sameAvg(fob)) {
            System.out.println("The same");
        } else {
            System.out.println("no Same");
        }

    }
}