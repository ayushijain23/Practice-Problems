package array;

import java.util.Stack;

/*
 * https://www.geeksforgeeks.org/next-greater-element/
 * 
 * Input - { 11, 13, 21, 3 }; 
 * Output-{13, 21, -1, -1};
 */
public class Next_Greater_2 {

	private static void printArray(int arr[])
	{
		for( int i : arr)
		{
			System.out.print(i+" ");
		}
	}
	
	
	private static int[] findNext( int arr[])
	{
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for( int i = 1; i < arr.length ; i++)
		{
			if( arr[i] > arr[stack.peek()])
			{
				while(!stack.isEmpty() && arr[i] > arr[stack.peek()])
				{
					arr[stack.pop()] = arr[i];
				}
			}
			
		stack.push(i);
		}
		
		while( !stack.isEmpty())
		{
			arr[stack.pop()] = -1;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {7,8,1, 4};
       
       arr = findNext(arr);
       
       printArray(arr);
   }

}
