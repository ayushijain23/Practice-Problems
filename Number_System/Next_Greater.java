package Number_System;

/*
 * https://www.geeksforgeeks.org/find-next-greater-number-set-digits/
 * 
 * Input : 213
 * Output : 231
 * 
 * Input : 2346789
 * Output : 2364789
 
 done
 */
public class Next_Greater {

	private static int nextGreater(int n)
	{
		int res;
		int i = 0;
		
		String str = Integer.toString(n);
		char ch[] = str.toCharArray();
		
		for( i =  ch.length-1 ;i >=1 ;i--)
		{
			if(ch[i] > ch[i-1])
			{
				char temp = ch[i];
				ch[i] = ch[i-1];
				ch[i-1] = temp;
				break;							
			}
		}
		
		if(i==0)
		{
			return -1;
		}
		
	    res = Integer.parseInt(new String(ch));
	 	
		return res;
	}
	public static void main(String[] args) {
		int n = 218765;
		
		int result = nextGreater(n);
        System.out.println(result);
	}

}
