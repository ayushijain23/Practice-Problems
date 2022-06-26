package Recursion;

public class JumpPractice {

    public static void printPaths(int mat[][], int i, int j, int row, int col, String result ){
        //base condition
        if( i == row && j == col){
            System.out.print(result + " ");
            return;
        }

        //horizontal
        for(int hj = 1; hj <= col - j; hj++){
            printPaths(mat, i, hj + j, row, col, result + "h" + Integer.toString(hj));
        }

        //vertical
        for(int vj = 1; vj <= row - i; vj++){
            printPaths(mat, vj + i, j, row, col, result + "v" + Integer.toString(vj));
        }

        //diagonal jump
        for(int dj = 1; dj <= row- i && dj <= col -j; dj++){
            printPaths(mat, dj +i, dj +j, row, col, result + "d" + Integer.toString(dj));
        }
    }
    public static void main(String[] args) {
      int row = 3;
      int col = 3;
      int mat[][] = new int[row][col];
      printPaths(mat, 0, 0, row -1 , col -1 , "");
    }
}
