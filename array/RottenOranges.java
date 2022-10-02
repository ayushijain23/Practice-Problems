package array;

import java.util.LinkedList;
import java.util.Queue;

/*
https://leetcode.com/problems/rotting-oranges/
 */
public class RottenOranges {
    public static int findMinutes(int grid[][]){
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] directions = {{ 1, 0}, { -1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> rottenOranges = new LinkedList<>();

        int minutes = 0;
        int fresh = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 2){
                    rottenOranges.add(new int[]{i, j});
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        while(!rottenOranges.isEmpty() && fresh > 0){
            minutes++;
            int size = rottenOranges.size();
            while(size-- > 0){
                int temp[] = rottenOranges.poll();
                for(int dir[] : directions){
                    int x = dir[0] + temp[0];
                    int y = dir[1] + temp[1];

                    if( x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 2 || grid[x][y] == 0){
                        continue;
                    }

                    else if(grid[x][y] == 1){
                        grid[x][y] = 2;
                        fresh--;
                        rottenOranges.add(new int[]{ x, y});
                    }
                }
            }
        }
        return fresh == 0 ? minutes : -1;
    }

    public static void main(String[] args) {
        int grid[][] = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println("Minutes 1st grid: "+findMinutes(grid));

        int grid2[][] = {{2,1,1},{0,1,1},{1,0,1}};
        System.out.println("Minutes 2nd grid: "+ findMinutes(grid2));
    }
}
