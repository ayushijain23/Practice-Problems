package array;

/*
https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/
 */
public class Repeating_And_Missing_No {
    private static int[] findTwoElement(int arr[], int n) {
        int res[] = new int[2];
        for(int ind = 0; ind < n; ind++){
            int temp = Math.abs(arr[ind]);
            if(arr[temp - 1] < 0){
                res[0] = temp;
            }
            else{
                arr[temp - 1] = arr[temp - 1] * -1;
            }
        }

        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                res[1] = i + 1;
                break;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
        int n = arr.length;
        int res[] = findTwoElement(arr, n);
        System.out.println("Repeating No - "+ res[0]);
        System.out.println("Missing No - "+ res[1]);
    }
}
