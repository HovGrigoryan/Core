package chapter6.stack;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

public class StackTest {
    public static void main(String[] args) {
        Stack mystack = new Stack();
        mystack.push(77);
        mystack.push(88);
        mystack.push(14);
        mystack.push(15);
        mystack.push(93);
        mystack.push(84);
        mystack.push(25);
        mystack.push(21);
        mystack.push(932);
        mystack.push(55);
        mystack.push(87);
        mystack.push(75);
        mystack.push(70);
        mystack.push(74);

        int last = mystack.pop();
        System.out.println(last);
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
    }
}
