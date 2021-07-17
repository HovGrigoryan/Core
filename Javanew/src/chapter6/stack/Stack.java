package chapter6.stack;

public class Stack {
    int[] array = new int[10];
    int index;

    Stack() {
        index = -1;
    }

    void push(int value) {
        if (index == 9) {
            System.out.println("Տեղ չկա");
        } else {
            array[++index] = value;
        }
    }

    int pop() {
        if (index < 0) {
            System.out.println("էլեմենտ չկա");
            return 0;
        } else {
            return array[index--];
        }
    }
}
