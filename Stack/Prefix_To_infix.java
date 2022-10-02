package Stack;

// https://www.geeksforgeeks.org/prefix-infix-conversion/

import java.util.Stack;

public class Prefix_To_infix {
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
        for(int i = len - 1; i >= 0 ; i--){
            char ch = str.charAt(i);
            if(isOperator(ch)){
                String opr1 = stack.pop();
                String opr2 = stack.pop();
                String res = "("+ opr1 + ch + opr2+ ")";
                stack.push(res);
            }
            else{
                stack.push(str.charAt(i)+ "");
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        String str = "*-A/BC-/AKL";  // ans should be - ((A-(B/C))*((A/K)-L))
        System.out.println(convert(str));

        System.out.println(convert("*+AB-CD"));

    }
}
