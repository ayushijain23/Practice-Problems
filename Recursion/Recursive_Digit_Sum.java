package Recursion;

public class Recursive_Digit_Sum {
	
	private static String resultantStr(String n, int k)
	{  String temp = n;
		while(k>1)
		{
			n = n+temp;
			k--;
		}
		return n;
	}
	
	private static int digitSum(String str)
	{
		int sum = 0;
		for(int i = 0; i < str.length(); i++)
		{
			//int t = Integer.parseInt(String.valueOf(str.charAt(i)));
			int t = str.charAt(i) - '0';
			sum = sum + t;
		}
		
		if( sum < 10)
		{
			return sum;
		}
		
		int result = digitSum(Integer.toString(sum));
		
		return result;
	}
	
	private static int digitSum2(String str)
	{
		int temp = Integer.parseInt(str);
		if(temp == 0)
		{
			return 0;
		}
		return (temp % 9 == 0) ? 9 : (temp % 9);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String n = "148";
       int k = 3;
       int sum = 0;
       for(int i = 0; i < n.length(); i++)
       {
           //int t = Integer.parseInt(String.valueOf(str.charAt(i)));
           int t = n.charAt(i) - '0';
           sum = sum + t;
       }
       
       sum = sum * k ;
       System.out.println(sum);
       
       int result = digitSum(Integer.toString(sum));
       System.out.println(result);
       
       int result2 = digitSum2(Integer.toString(sum));
       System.out.println(result2);

		int result3 = digitSum2("148");
		System.out.println(result3);
	}

}
