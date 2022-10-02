package Stack;
/*
https://www.geeksforgeeks.org/postfix-to-infix/
 */
import java.util.Stack;

public class Postfix_To_Infix {
    public static boolean isOperator(char ch){
        switch(ch){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;

        }
        return false;
    }
    public static String convert(String str){
        int len = str.length();
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < len ; i++){
            char ch = str.charAt(i);
            if(isOperator(ch)){
                String opr1 = stack.pop();
                String opr2 = stack.pop();
                String res = "("+ opr2 + ch + opr1+ ")";
                stack.push(res);
            }
            else{
               stack.push(str.charAt(i)+ "");
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        String str = "abc++";
        System.out.println(convert(str));
        System.out.println(convert("ab*c+"));
    }
}
