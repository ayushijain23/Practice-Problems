package array;

/*
 * https://www.hackerrank.com/challenges/flatland-space-stations/problem
 * 
 * Sample Input-
   5 2
   0 4
   
   Sample Output-
   2
   
 */
public class Maximum_Distance_from_Station {
	private static void printArray(int arr[])
	{
		for( int i : arr)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		
         int n = 5;
         int m = 2;
       //  int spaces[] = {0,4};
         
         n = 6;
         m = 6;
       int  spaces[] = {0,1, 2, 4, 3, 5};
         
         int arr[] = new int[n];
         for( int i = 0 ;i < spaces.length; i++)
         {
        	 arr[spaces[i]]++;
         }
         
        // printArray(arr);
         
         int maxVal = 0;
         for( int i = 1 ;i <=n ;i++)
         {
        	 int count1 = 0;
    		 int count2 = 0;
    		 
        	 if(arr[i-1]==1)
        	 {
        		 maxVal = Math.max(maxVal, 0);
        	 }
        	 
        	 else {
        		 
        		 for( int j = i-2; j >=0 ;j--)
        		 {
        			 count1++;
        			 if(arr[j] == 1)
        			 {
        				 break;
        			 }
        			 
        		 }
        		 for( int j = i ;j<n;j++)
        		 {
        			 count2++;
        			 if( arr[j]==1)
        			 {
        				 break;
        			 }
        		 }
              		 
        	 }
        	 System.out.println(count1+" "+count2);
        	 int temp = Math.min(count1, count2);
        	 maxVal = Math.max(maxVal,temp);
        	
         }
        System.out.println(maxVal);
	}

}
