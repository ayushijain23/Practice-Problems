package Recursion;

import java.util.Scanner;

/*
 * Input = 5
 * Output : 5 4 3 2 1 1 2 3 4 5
 */
public class Print_Decreasing_Increasing {
	
	private static void DecreasingIncreasing(int n)
	{
		if(n==0)
			return;
		
		System.out.print(n+" ");
		DecreasingIncreasing(n-1);
		System.out.print(n+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner kb = new Scanner(System.in);
          int n = kb.nextInt();
          
          DecreasingIncreasing(n);
	}

}
