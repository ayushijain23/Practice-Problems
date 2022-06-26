package DP;

/*
https://www.geeksforgeeks.org/count-number-binary-strings-without-consecutive-1s/
 */
public class No_Consecutive_1s {
    public static int totalBinaryStringsWithNoCon1(int N){
        int old0 = 1;
        int old1 = 1;

        for(int i = 2; i <= N; i++){
            int new0 = old0 + old1;
            int new1 = old0;

            old0 = new0;
            old1 = new1;
        }
       return old0 + old1;
    }
    public static void main(String[] args) {
        int N = 4;
        int totalBinaryStrings = totalBinaryStringsWithNoCon1(N);
        System.out.println(totalBinaryStrings);

        totalBinaryStrings = totalBinaryStringsWithNoCon1(3);
        System.out.println(totalBinaryStrings);
    }
}
