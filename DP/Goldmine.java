package DP;

/*
There is m * n 2d matrix, and each cell has some value which represents GOld amount.
 Find maximum gold collected if starting from first column till last column where following moves are allowed.
1. Move right
2. move top right
3. move bottom right

TestCase -
Input - { 1, 2, 3, 4
          0, 1 , 9, 3
          2, 8, 3, 3 }
MaxGold value - 23 if start from grid[2][0]

 */

public class Goldmine {
    private static int findGoldMax(int mine[][]){
        int dp[][] = new int[mine.length][mine[0].length];
            for(int col = dp[0].length - 1; col >= 0; col-- )
               {
                for(int row = dp.length -1 ; row >= 0; row--){

                 if( col == dp[0].length - 1){
                    dp[row][col] = mine[row][col];
                 }
                 else if( row == 0){
                    dp[row][col] = Math.max(dp[row][col + 1], dp[row + 1][col + 1]) + mine[row][col];
                 }
                 else if( row == dp.length - 1){
                    dp[row][col] = Math.max(dp[row][col + 1], dp[row - 1][col + 1]) + mine[row][col];
                 }
                 else{
                    dp[row][col] = Math.max(Math.max(dp[row][col + 1], dp[row - 1][col + 1]), dp[row + 1][col + 1]) + mine[row][col];
                 }
            }
        }

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length ; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        //now first column will have value which states what is max gold collected at each cell
        // so finding max of first column to get answer


        int maxGold = dp[0][0];
        for(int row = dp.length -1 ; row >= 0; row--){
            if(dp[row][0] > maxGold){
                maxGold = dp[row][0];
            }
        }
        return maxGold;
    }
    public static void main(String[] args) {
        int mine[][] = {{1, 2, 3, 4}, {0, 1, 9, 3}, {2, 8, 3, 3}};
        int row = mine.length;
        int col = mine[0].length;
        System.out.println(row + " -- "+ col);
        int goldCollected = findGoldMax(mine);
        System.out.println(goldCollected);
    }
}
