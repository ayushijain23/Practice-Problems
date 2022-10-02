package Sorting;

public class Search_In_Rotated_Array {

	private static int findPivot(int arr[])
	{
		int li = 0;
		int hi = arr.length - 1;
		while( li < hi)
		{
			int mid = (li + hi)/2;
			
			if( arr[mid] > arr[hi])
			{
				li = mid+1;
			}
			else {
				hi = mid;
			}
		}
        if( li == 0)
        {
            return -1;
        }
		return li;
	}
    
    public static int findTarget(int arr[], int low, int high, int temp)
	{
        
    	while( low <= high)
		{
			int mid = (low+high)/2;
			
			if(arr[mid] == temp)
			{
				return mid;
			}
			else if( arr[mid] > temp)
			{
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return -1;
	}
    
    public static int binarySearch(int arr[],int target)
    {
        int high = arr.length - 1;
       int low = 0;
        
        while( low<=high)
        {
             int mid = (low+high)/2;
             if( arr[mid] == target)
             {
            	 System.out.println(mid);
                 return mid;
             }
            else if( arr[mid] > target)
            {
                high = mid - 1;
            }
            
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    
	public static int search(int[] arr, int target)
	{
		int low = 0;
		int high = arr.length-1;
		
        int pivotIndex = findPivot(arr);
        System.out.println(pivotIndex);
        if( pivotIndex == -1)
        {
        	System.out.println(pivotIndex);
        	System.out.println(binarySearch(arr,target));
            return binarySearch(arr,target);
        }
        System.out.println(pivotIndex);
        
        if( arr[pivotIndex] == target)
		{
			return pivotIndex;
		}

        if( arr[0] > target)
        {
            return findTarget(arr, pivotIndex+1,high,target);
        }    
         return findTarget(arr, low, pivotIndex-1,target);
        
	}
	public static void main(String[] args) {
		int arr[] = {1};
		int temp = 0;
		System.out.println(search(arr,temp));
	}

}
