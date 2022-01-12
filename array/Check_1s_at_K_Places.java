package array;
//example added
public class Check_1s_at_K_Places {
	
	private static boolean kLengthApart(int[] nums, int k)
	{
        int l = -1;
        int h = -1;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if( nums[i] == 1 && l == -1)
            {
            	l = i;
            }
            
            else if(nums[i] == 1)
            {
            	h = i;
            	if( h - l <=k)
            	{
            		return false;
            	}
            	l = i;
            }
        }
        return true;
	}

	public static void main(String[] args) {
		int arr [] = {1,0,0,1,1,0,0,1};
		int k = 2;
		
		System.out.println(kLengthApart(arr,k));

	}

}
