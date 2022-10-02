package array;
import java.util.*;

/*
https://www.geeksforgeeks.org/the-celebrity-problem/
 */

public class Celebrity_AKnowsB {
    public static boolean knows(int M[][], int a, int b){
        return M[a][b] == 1 ? true : false;
    }
    public static int findCelebrity(int M[][], int n)
    {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            stack.push(i);
        }

        while(stack.size() > 1){
            int first = stack.pop();
            int second = stack.pop();

            if(knows(M, first, second)){
                stack.push(second);
            }
            else{
                stack.push(first);
            }
        }

        if(stack.size() == 0){
            return -1;
        }

        int lastperson = stack.pop();
        for(int i = 0; i < n; i++){
            if( i != lastperson && (!knows(M, i, lastperson) || knows(M, lastperson, i))){
                return -1;
            }
        }

        return lastperson;
    }
    public static void main(String[] args) {
        int n = 3;
        int matrix[][] =  {{0, 1, 0},
                           {0, 0, 0},
                           {0 ,1, 0}};

        int celebrity = findCelebrity(matrix, n);
        System.out.println(celebrity);

        int n2 = 2;
        int matrix2[][] =  {{0, 1},
                            {1, 0}};

        int celebrity2 = findCelebrity(matrix2, n2);
        System.out.println(celebrity2);
    }
}
