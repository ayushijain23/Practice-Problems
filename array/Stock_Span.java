package array;

import java.util.Arrays;
import java.util.Stack;

/*
 * https://www.geeksforgeeks.org/the-stock-span-problem/
 */
public class Stock_Span {
	private static void printArray(int arr[])
	{
		for( int i : arr)
		{
			System.out.print(i+" ");
		}
	}

	//Method -1 O(n^2) solution
    private static int[] findSpans( int arr[])
    {
    	int res [] = new int[arr.length];
    	res[0] = 1;
    	for( int i = 1; i < arr.length ; i++ )
    	{
    		int count = 1;
    		for( int j = i-1; j>=0 ;j--)
    		{
    			if( arr[j] <= arr[i])
    			{
    				count++;
    			}
    			else
    			{
    				break;
    			}
    		}
    		res[i] = count;
    	}
    	return res;
    }
    
    // Method -2 with Stack
    private static int[] findSpans2( int arr[])
    {
    	int res [] = new int[arr.length];
    	Stack<Integer> stack = new Stack<>();
    	
    	stack.push(0);
    	res[0] = 1;
    	
    	for( int i = 1; i < arr.length ; i++)
    	{
    		while( !stack.isEmpty() && arr[i] >= arr[stack.peek()])
    		{
    			stack.pop();
    		}
    		
    		res[i] = stack.isEmpty() ? i+1 : (i - stack.peek());
    		
    		stack.push(i);
    	}
    	return res;
    }
    
    
	public static void main(String[] args) {
		int input [] = {10, 13, 5, 90, 120, 80};
		
		int result[] = findSpans(input);
		printArray(result);
		
		System.out.println();
		
		result = findSpans2(input);
		printArray(result);
	}

}
