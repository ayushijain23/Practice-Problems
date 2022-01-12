/*
Write a program to reverse a stack using recursion. 

 Input - Original Stack 
 1  2  3  4 
 Output - Reversed Stack 
 4  3  2  1 
 */
package Recursion;

import java.util.Stack;


public class Reverse_Stack {
  static Stack<Integer> stack = new Stack();
    static void pushAtBottom(int temp)
    {
        if(stack.isEmpty())
            stack.push(temp);
        
        else
        {
            int k = stack.pop();
            pushAtBottom(temp);
            
            stack.push(k);
        }
    }
    
    static void reverse(Stack<Integer> stack)
    {
           if(stack.size() >0)
           {
               int temp = stack.peek();
               
               stack.pop();
               
               reverse(stack);
               
               pushAtBottom(temp);
           }
           else
               return;
        
        
    }
    
    
    public static void main(String args[])
    {   
        
        stack.push(3);
        stack.push(2);
        stack.push(1);
     
      
        
         System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
        

   }
}
