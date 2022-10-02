package array;

public class PrefixMax {
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int prefixArr[] = new int[arr.length];
        int suffixArr[] = new int[arr.length];

       //prefix Max
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
            prefixArr[i] = max;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(prefixArr[i]+" ");
        }
        System.out.println();
        //suffix Max
        int maxS = Integer.MIN_VALUE;
        for(int i = arr.length - 1; i >= 0; i--){
            maxS = Math.max(maxS, arr[i]);
            suffixArr[i] = maxS;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(suffixArr[i]+" ");
        }

    }
}
