
package Recursion;


/*
 * find Power(x,y) - x^y in logarithim Time
 */
public class Power {

	private static int findPower(int x,int y)
	{
		if(y == 0){
			return 1;
		}
		int temp = findPower(x, y/2);
		if(y % 2 == 1){
			return temp * temp * x;
		}
		return temp * temp;
	}

	static long mod = 1000000007;
	static long power(int N,int R)
	{
		long res = 1;
		long num = (long)N;
		while(R > 0){
			if(R % 2 == 1){
				res = (res * num) % mod;
			}

			R = R >> 1; // R = R/2;
			num = (num * num) % mod;
		}
		return res % mod ;
	}

	public static float powerOfNegativeNumber(float x, int y){
		if(y == 0){
			return 1;
		}
		float temp = powerOfNegativeNumber(x, y/2);
		if(y % 2 == 0){
			return temp * temp;
		}

		else{
			if(y > 0){
				return x * temp * temp;
			}
			else{
				return (temp * temp)/x;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int x = 3;
            int y = 5;
            
            int result = findPower(2,5);
            System.out.println(result);

		long result2 = power(2,5);
		System.out.println(result2);

		float result3 = powerOfNegativeNumber(2, -3);
		System.out.println(result3);
	}

}
