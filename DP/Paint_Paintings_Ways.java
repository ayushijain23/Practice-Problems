package DP;

public class Paint_Paintings_Ways {

    static int modd = 1000000007;
    public static long power(int x, int y){
        if( y == 0)
            return 1;

        if(y % 2 == 1){
            return (x * (power(x, y/2) % modd) * (power(x, y/2) % modd)) % modd;
        }
        else
            return (power(x, y/2) % modd * power(x, y/2) % modd) % modd;
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
