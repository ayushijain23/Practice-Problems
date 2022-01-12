/*
 Problem -

Sort a stack using recursion but while, for..etc is not allowed.

Stack elements before sorting:
[30, -5, 18, 14, -3]
[stack bottom -> stack top]

Stack elements after sorting- descending order:
[30 18 14 -3 -5] 

Stack elements after sorting- Ascending order:
[-5 -3 14 18 30]

Note - print(stack) - always print from botton to top

 */
package Recursion;

import java.util.*;

public class Sort_Stack {
    
    public static Stack sort_Stack(Stack<Integer>stacktemp)
    {
        List<Integer> list = new ArrayList<>();
      Stack<Integer>stack = stacktemp;
        while(!stack.isEmpty())
        {
            list.add(stack.pop());
        }
        Collections.sort(list);
        
        for(int i : list)
        {
            stack.push(i);
        }
        
        return stack;
    }
    public static void sort_stack_ByRecursion_Ascending(Stack<Integer> stack)
    {
        if( !stack.isEmpty())
        {
            int val = stack.pop();                   
            
            sort_stack_ByRecursion_Ascending(stack);        // popping all elements one by one by calling sort fun recursively
            
            sortInsert_Ascending(stack,val);         // start inserting in stack when stack becomes empty.
        }     
    }
    
    
    
    public static void sortInsert_Ascending(Stack<Integer>stack, int val)
    {
        if( stack.isEmpty() || val > stack.peek())
            stack.push(val);
        
        else
        {
            int temp = stack.pop();
            sortInsert_Ascending(stack,val);         // to popping out elements till val is less than stack top
            stack.push(temp);                        // inserting popped elements again into stack
        }
    }
    
       public static void sort_stack_ByRecursion_Descending(Stack<Integer> stack)
    {
        if( !stack.isEmpty())
        {
            int val = stack.pop();                   
            
            sort_stack_ByRecursion_Descending(stack);        // popping all elements one by one by calling sort fun recursively
            
            sortInsert_Descending(stack,val);         // start inserting in stack when stack becomes empty.
        }     
    }
    public static void sortInsert_Descending(Stack<Integer>stack, int val)
    {
        if( stack.isEmpty() || val < stack.peek())
            stack.push(val);
        
        else
        {
            int temp = stack.pop();
            sortInsert_Descending(stack,val);         // to popping out elements till val is more than stack top
            stack.push(temp);                        // inserting popped elements again into stack
        }
    }
    
    public static void main(String args[])
    {   
        Stack<Integer> stack = new Stack<>();      
        Scanner kb = new Scanner(System.in);
        int length = kb.nextInt();
        for(int i = 0;i<length;i++)
       {
           int temp = kb.nextInt();
           stack.push(temp);
       }
        
        System.out.println(stack);
        
         sort_Stack(stack);   //iterative
         System.out.println(stack);
         
        sort_stack_ByRecursion_Ascending(stack);      //Ascending recursive
        System.out.println(stack);
          
        sort_stack_ByRecursion_Descending(stack);      //Descending recursive
        System.out.println(stack);
        

   }
}
