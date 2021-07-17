package homework.chapte5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println(" The operator break");
                    if (t){
                        break second;
                    }
                    System.out.println("This operator will not perform with");
                }
                System.out.println("This operator will not perform with");

            }
            System.out.println("This operator follows block second");
        }
    }
}
