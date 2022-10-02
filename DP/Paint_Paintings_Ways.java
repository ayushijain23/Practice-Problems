package DP;

public class Paint_Paintings_Ways {

    static int modd = 1000000007;
    public static long power(int x, int y){
        if( y == 0)
            return 1;

        long temp = power(x, y/2) % modd;

        if(y % 2 == 1){
            return (x * temp * temp ) % modd;
        }
        else
            return (temp * temp) % modd;
    }
    public static int ways(int m, int n){
        return (int)(power(m- 1, n - 1) * m % modd);
    }

    public static void main(String[] args) {
        int paintings = 6;
        int colors = 5;
        System.out.println(ways(colors, paintings));
    }

}
