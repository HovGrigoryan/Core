package chapter7continue.example4massiv;

import static chapter7continue.example4massiv.VarArgs.vaTest;

public class VarArgsTest {
    public static void main(String[] args) {
        VarArgs varArgs = new VarArgs();
        vaTest(" one argument ",10);
        vaTest(" Three argument ",10,20,30);
        vaTest(" no argument " );
    }
}
