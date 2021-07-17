package chapter14.example3;

import java.util.Date;

public class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i].doubleValue();

        }
        return sum / nums.length;
    }
}

class BoundDemo{
    public static void main(String[] args) {
        Integer inums [] = {1,2,3,4,5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("Middle number iob will be " + v);

        Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("Middle number dob will be " + w);
    }

}
