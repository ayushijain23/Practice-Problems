package Number_System;

public class squareRoot {
    static int countSquares(int N) {
        // code here
        int low = 1;
        int high = N;
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if(mid * mid == N){
                return mid;
            }
            else if(mid * mid < N){
                low = mid + 1;
                ans = mid;
            }
            else{
                high = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 63;
        int val = countSquares(n);
        System.out.println(val);
    }
}
