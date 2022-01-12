package array;

/*
 * 
 * https://www.geeksforgeeks.org/count-frequencies-elements-array-o1-extra-space-time/
 * Example-
 * Input: arr[] = {2, 3, 3, 2, 5}
   Output: Below are frequencies of all elements
   
   
        1 -> 0
        2 -> 2
        3 -> 2
        4 -> 0
        5 -> 1
 */
public class Find_Frequency {
	
	public static void findFrequency(int arr[], int n)
	{
		int len = n;
		   for(int i = 0;i < len; i++)
		   {
		     arr[i] = arr[i] - 1;
		   }
		   
		    for(int i = 0;i < len; i++)
		   {
		     arr[arr[i]%len] = arr[arr[i]%len] + len;
		   }
		   
		    for(int i = 0;i < len; i++)
		   {
		     System.out.println(i+1+" ->"+(arr[i]/len));
		   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int arr[] = {1,2,2,3,4,5};
		    int arr2[] = {1,1,1,2,2,3,3,3,3,5};
		   findFrequency(arr,arr.length);
		   System.out.println();
		   findFrequency(arr2,arr2.length);
		   
	}

}
