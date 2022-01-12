package Recursion;

public class Reverse_Array {

	public static void revArray(int arr[], int idx)
	{
		if(idx == arr.length)
			return;
		
		revArray(arr, idx + 1);
		System.out.print(arr[idx]+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {10,20,30,40,50,60};
       
       revArray(arr, 0);
	}

}
