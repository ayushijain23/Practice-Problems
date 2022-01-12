
package Recursion;


/*
 * find Power(x,y) - x^y in logarithim Time
 */
public class Power {

	private static int findPower(int x,int y)
	{
		if(y==0)
		{
			return 1;
		}
//		
//		int prev = findPower(x,y/2);
//	    int res = prev * prev;
//		if(y%2==1)
//		{
//			res = res * x;
//		}
//		
//		return res;
		if(y%2 == 1)
		{
			return x * findPower(x,y/2) * findPower(x,y/2);
		}
		
		return findPower(x,y/2) * findPower(x,y/2) ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int x = 3;
            int y = 5;
            
            int result = findPower(2,5);
            System.out.println(result);
	}

}
