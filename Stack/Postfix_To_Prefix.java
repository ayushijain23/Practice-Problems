package Stack;
/*
https://www.geeksforgeeks.org/postfix-prefix-conversion/
 */
import java.util.Stack;

public class Postfix_To_Prefix {
    public static boolean isOperator(char ch){
        switch (ch){
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
               String op1 = stack.pop();
               String op2 = stack.pop();
               String temp = ch + op2 + op1;
               stack.push(temp);
            }
            else{
                stack.push(ch + "");
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        String str = "ABC/-AK/L-*";   // ans should be   *-A/BC-/AKL
        System.out.println(convert(str));
        System.out.println(convert("AB+CD-*"));   //Ans -   *+AB-CD

    }
}
