package matrix;

/*
     0, X, X
     0, X, 0
     X, 0, X

  find winner in tictactoa,
  where 0 represents 1st player
  And X represnets 2nd player
 */
public class TicTacToe_Winner {
    public static int winner(int arr[][]){
        int row1[] = new int [arr.length];
        int row2[] = new int [arr.length];
        int col1[] = new int [arr.length];
        int col2[] = new int [arr.length];
        int n = arr[0].length;
        int leftDuser1 = 0;
        int leftDuser2 = 0;
        int rightDuser1 = 0;
        int rightDuser2 = 0;
        for(int input[] : arr){
            int x = input[0];
            int y = input[1];
            int user = input[2];

            if(user == 1){
                row1[x]++;
                col1[y]++;
                if(row1[x] == n || col1[y] == n)
                    return user;
                if(x == y){
                    leftDuser1++;
                    if(leftDuser1 == n){
                        return user;
                    }
                }
                if(y + x == n - 1){
                    rightDuser1++;
                    if(rightDuser1 == n){
                        return user;
                    }
                }
            }
            if(user == 2){
                row2[x]++;
                col2[y]++;
                if(row2[x] == n || col2[y] == n)
                    return user;
                if(x == y){
                    leftDuser2++;
                    if(leftDuser2 == n){
                        return user;
                    }
                }
                if(y + x == n - 1){
                    rightDuser2++;
                    if(rightDuser2 == n){
                        return user;
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[][] = {{0, 0, 1},{0, 1, 2}, {0, 2, 2}, {1,0,1}, {1,1,2}, {1,2,1}, {2,0,2}, {2,1,1}, {2,2,2} };
        System.out.println(winner(arr));
    }
}
