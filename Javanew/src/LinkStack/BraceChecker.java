package LinkStack;

public class BraceChecker {

    char[] content;

    BraceChecker(String text) {
        this.content = text.toCharArray();
    }

    boolean check() {
        LinkedStack stack = new LinkedStack(content.length / 2 + 1);
        for (int i = 0; i < this.content.length; i++) {
            if (stack.size() > content.length - i) {
                return false;
            }
            char ch = this.content[i];
            switch (ch) {
                case '{':
                case '(':
                case '[':
                    stack.push(ch);
                    break;
                case '}':
                case ')':
                case ']':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    int diff = ch - stack.pop();
                    if ((diff != 1 && diff != 2)) {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        BraceChecker braceChecker = new BraceChecker("[{(hjhjhj)}]");
        System.out.println(braceChecker.check());
    }
}
