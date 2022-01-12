package Recursion;

import java.util.Scanner;

public class Tower_Of_Hanoi {
	
	public static void towerOfHanoi(int n, char A, char B, char C)
	{  
		if(n == 0)
			return;
		
		
		towerOfHanoi(n-1, A, C, B);
		
		System.out.println("Disk"+n+" moved from "+A+ " To "+B);
		
		towerOfHanoi(n-1, C, B, A);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       
       towerOfHanoi(n, 'A','B','C');
	}

}
