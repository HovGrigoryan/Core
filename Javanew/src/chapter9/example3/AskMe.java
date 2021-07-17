package chapter9.example3;

public class AskMe implements SharedConstants {
    static void answer(int result){
        switch (result){
            case NO:
                System.out.println("net");
                break;
            case YES:
                System.out.println("da");
                break;
            case MAYBE:
                System.out.println("hnaravor e");
                break;
            case LATER:
                System.out.println("ush");
                break;
            case SOON:
                System.out.println("shutov");
                break;
            case NEVER:
                System.out.println("nekogda");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}


