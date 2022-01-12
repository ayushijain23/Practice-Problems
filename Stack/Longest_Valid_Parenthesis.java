package Stack;

import java.util.Stack;

/*

*/
public class Longest_Valid_Parenthesis {
	
	public static int findLongestValid(String str)
	{
		int count = 0;
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		for(int i=0; i<str.length(); i++)
		{
			char temp = str.charAt(i);
			if(temp == '(')
			{
				stack.push(i);
			}
			
			else {
				
				if(!stack.isEmpty())
				{
					stack.pop();
				}
				
				if(!stack.isEmpty())
				{
					count = Math.max(count,  i - stack.peek());
				}
				else
				{
					stack.push(i);
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String input = "(())()()";
       String input2 = "()(()))))";
       String input3 = "))(())";
       System.out.println(findLongestValid(input));
       System.out.println(findLongestValid(input2));
       System.out.println(findLongestValid(input3));
	}

}
