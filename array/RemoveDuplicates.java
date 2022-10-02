package array;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,0,3,4,2,6,0,2,3,0,2};
        List<Integer> unique = new ArrayList<>();

        int i = 0;
        while( i < arr.length){
            if(arr[Math.abs(arr[i])] < 0){
                i++;
            }
            else{
                unique.add(Math.abs(arr[i]));
                arr[Math.abs(arr[i])] = arr[Math.abs(arr[i])] * -1;
                i++;
            }
        }

        System.out.println(unique);
    }
}
