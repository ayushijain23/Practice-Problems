package Recursion;

import java.io.InputStreamReader;
import java.util.Stack;
import java.io.BufferedReader;
public class StackSort{

    public static void sortStackByRecursionAsc(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int val = stack.pop();
            sortStackByRecursionAsc(stack);
            sortInAscendingOrder(stack, val);
        }
    }
    public static void sortInAscendingOrder(Stack<Integer> stack, int val){

        if(stack.isEmpty() || val > stack.peek()) {
            stack.push(val);
        }
        else{
            int temp = stack.pop();
            sortInAscendingOrder(stack, val);
            stack.push(temp);
        }
    }

    public static void sortStackByRecursionDsc(Stack<Integer>stack){
        if(!stack.isEmpty()){
            int val = stack.pop();
            sortStackByRecursionDsc(stack);
            sortInDescendingOrder(stack, val);
        }
    }

    public static void sortInDescendingOrder(Stack<Integer> stack, int val){
        if(stack.isEmpty() || val < stack.peek()){
            stack.push(val);
        }
        else{
            int temp = stack.pop();
            sortInDescendingOrder(stack, val);
            stack.push(temp);
        }
    }

    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String ss[] = input.trim().split("\\s");

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < ss.length; i++){
            stack.push(Integer.parseInt(ss[i]));
        }
        System.out.println(stack);
        sortStackByRecursionAsc(stack);
        System.out.println("After Ascending sort -> "+stack);

        sortStackByRecursionDsc(stack);
        System.out.println("After Descending sort -> "+stack);
    }


}
