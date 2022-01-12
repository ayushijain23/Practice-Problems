package array;
 /*
Sum triangle from array

Given an array of integers, print a sum triangle from it such that the first level has all array elements.
From then, at each level number of elements is one less than the previous level
and elements at the level is be the Sum of consecutive two elements in the previous level

Input : A = {1, 2, 3, 4, 5}
Output : [48]
         [20, 28] 
         [8, 12, 16] 
         [3, 5, 7, 9] 
         [1, 2, 3, 4, 5]
*/


public class Sum_Triangle_from_Array {
	
    public static void print(int temp[])
    {   System.out.print("[");
        for( int i :temp)
            System.out.print(i+" ");
        
        System.out.println("]");
    }
    
     public static void SumTraingle(int arr[])
     {
         int temp[] = new int[arr.length-1];
         if(temp.length==0)
             return;
         
         for( int i = 0;i<temp.length;i++)
         {
             temp[i] = arr[i]+arr[i+1];
         }
         
         SumTraingle(temp);
         print(temp);
         
     }
        public static void main(String[] args) {
       int arr[] = {10,20,40,10};
       SumTraingle(arr);
    }
}
