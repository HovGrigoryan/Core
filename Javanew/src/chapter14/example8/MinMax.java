package chapter14.example8;

public interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
}

class Myclass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    Myclass(T[] o) {
        vals = o;
    }

    public T min() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) v = vals[i];


        }
        return v;
    }

    public T max() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) v = vals[i];
        }
        return v;
    }
}


class GenIfDemo{
    public static void main(String[] args) {
        Integer inums[] = {3,6,2,8,6};
        Character chs[] = {'b','r','p','w'};

        Myclass<Integer> iob = new Myclass<Integer>(inums);
        Myclass<Character> cob = new Myclass<Character>(chs);

        System.out.println("inums: " +  iob.max());
        System.out.println("Inums: " + iob.min());
        System.out.println("cob: " + cob.min());
        System.out.println("cob: " + cob.min());
    }
}


