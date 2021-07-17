package chapter7.examples.homework;

public class BraceCheker {
    //սա հենց տեքստն է
    private String text;

    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    //Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    public BraceCheker(String a) {
        text = a;
    }

    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե stack-ի հետ, թե վերևի text-ի
    public void check() {
        Stack mystack = new Stack();
        char last;
        char[] ar = text.toCharArray();
        for (int i = 0; i < ar.length; i++) {
            switch (ar[i]) {
                case '(':
                    mystack.push('(');
                    break;
                case '{':
                    mystack.push('{');
                    break;
                case '[':
                    mystack.push('[');
                    break;
                case ')':
                    last = mystack.pop();
                    if (last != '(') {
                        if (last == 0) {
                            System.out.println("Error: closed ) but not opened at: " + i);
                        } else {
                            System.out.println("Error: closed ) but not opened " + last + " at: " + i);

                        }
                    }
                    break;
                case ']':
                    last = mystack.pop();
                    if (last != '[') {
                        if (last == 0) {
                            System.out.println("Error: closed ] but not opened at: " + i);
                        } else {
                            System.out.println("Error: closed ] but not opened " + last + " at: " + i);

                        }
                    }
                    break;
                case '}':
                    last = mystack.pop();
                    if (last != '{') {
                        if (last == 0) {
                            System.out.println("Error: closed } but not opened at: " + i);
                        } else {
                            System.out.println("Error: closed } but not opened " + last + " at: " + i);

                        }
                    }
                    break;

            }


        }
        while ((last = mystack.pop()) != 0){
            System.out.println("Error:  opened " + last + "but not closed " );
        }

    }


}




