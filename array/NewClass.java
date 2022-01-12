package array;
import java.io.*;
import java.util.*;
import java.lang.*;

public class NewClass {
    static int findMaxSum(int arr[])
            {
                int len = arr.length;
//                int maxfar = Integer.MIN_VALUE;
//                int maximum = Integer.MIN_VALUE;
                
              int  maxfar = arr[0];
              int  maximum = arr[0];
              int startIndex = 0;
              int endIndex = 0;
                for( int i = 1 ;i<len; i++)
                {
//                       if(arr[i] > maxfar+arr[i])
//                           startIndex = i;
                       if( maxfar < 0 )
                       {
                           maxfar = arr[i];
                           startIndex = i;
                           
                       }
                       
                       else
                       {
                           maxfar = maxfar+arr[i];
                       }
                   // maxfar = Math.max(arr[i], maxfar+arr[i]);
                    
                    
                    if( maximum < maxfar)
                    {
                        maximum = maxfar;
                        endIndex = i;
                    }
                    
                    
                  //  maximum = Math.max(maximum, maxfar);
                    
                    
                }
                System.out.print(startIndex +" "+endIndex);
                 System.out.println();
               return maximum; 
            }
    
       public static void main(String[] args) {
       int arr[] = {-2,0,-1,-3,5,4,-6,-5,7,5};
       int arr2[] = {-2,0,-1,-3};
       int arr3[] = {10,-9,20,-8};
       int result = findMaxSum(arr2);
       System.out.println(result);
    }
}
