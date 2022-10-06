import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

    static int precedence(char c){
        switch (c)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;

    }

    static String infixToPostFix(String expression){

        String postfix = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <expression.length() ; i++) {
            char c = expression.charAt(i);


            if(precedence(c)>0){
                while(stack.isEmpty()==false && precedence(stack.peek())>=precedence(c)){
                    postfix += stack.pop();
                }
                stack.push(c);
            }else if(c==')'){
                char x = stack.pop();
                while(x!='('){
                    postfix += x;
                    x = stack.pop();
                }
            }else if(c=='('){
                stack.push(c);
            }else{
                postfix += c;
            }
        }
        for (int i = 0; i <=stack.size() ; i++) {
            postfix += stack.pop();
        }
        return postfix;
    }

    public static void main(String[] args) {
        System.out.println("Enter an expression");
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        System.out.println("Infix Expression: " + exp);
        System.out.println("Postfix Expression: " + infixToPostFix(exp));
    }
}