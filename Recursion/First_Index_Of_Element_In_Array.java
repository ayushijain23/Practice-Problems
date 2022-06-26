package Recursion;

import java.util.ArrayList;
import java.util.List;

public class First_Index_Of_Element_In_Array {
	
private static void printArray(int arr[])
{
	for(int i : arr)
	{
		System.out.print(i+" ");
	}
}
	
private static int firstIndex(int arr[], int idx, int val)
{
	if(idx == arr.length)
		return -1;
	
	if(arr[idx] == val)
		return idx;
	
	else
	{
		int next = firstIndex(arr, idx+1, val);
		return next;		
	}
	
}

private static int LastIndex(int arr[], int idx, int val)
{
	if(idx == arr.length)
		return -1;
	
	int next = LastIndex(arr, idx +1, val);
	
	if(arr[idx] == val && next == -1)
	{
		return idx;
	}
	
	return next;
	
}

private static int[] allIndexes(int arr[], int idx, int val, int count)
{
    if(idx == arr.length)
    	return new int[count];
    
    if( arr[idx] == val)
    {
    	int[] arr1 = allIndexes(arr, idx+1, val, count + 1); 
    	arr1[count] = idx;
    	return arr1;
    }
    
    else
    {
    	int[] arr1 = allIndexes(arr,idx+1,val,count);
    	return arr1;
    }	
}
		
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {1,2,8,2,8,4,2,8,9,9};
       int val = 2;
       int index =  firstIndex(arr, 0, val);
       int indexLast =  LastIndex(arr, 0, 8);
       System.out.println(index);
       System.out.println(indexLast);

		 int indexLast2 =  findLast2(arr, arr.length - 1, 2);
		 System.out.println("LastIndex:"+indexLast2);

      int res[] = allIndexes(arr, 0, 2, 0);
      
      printArray(res);
     
	}

	public static int findLast2(int arr[], int idx, int val){
		if(idx == -1){
			return -1;
		}
	    if(arr[idx] == val)
		  return idx;

		else{
			return findLast2(arr, idx -1, val);
		}

	}

}
