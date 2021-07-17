package chapter7continue.example1.string;

public class StringDemo {
    public static void main(String[] args) {
        String mystring1 = "The first";
        String mystring2 = "The second";
        String mystring3 = mystring1;

        System.out.println("The First size " + mystring1.length());
        System.out.println("The Second 3rd elements " + mystring2.charAt(4));
        if (mystring1.equals(mystring2)){
            System.out.println("mystring1 == mytring2");
        }
        else{
            System.out.println("mystring1 != mytring2");
        }


    }
}
