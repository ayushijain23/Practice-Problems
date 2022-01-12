package Recursion;

/*
  https://www.youtube.com/watch?v=sPAT_DbvDj0&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=43
  lets take string  = "abc"
  now take one character at each time - a, b, or c
  loop will execute till string.length times.
  
  lets have char at index i, then remaining strings would be = str.substring(0,i) + syt.substring(i)
 
 */
public class Print_Permutation {
	
	 public static void printPermutations(String str, String ans) {
         if(str.length() == 0)
         {
             System.out.print(ans+", ");
             return;
         }
         for( int i = 0 ; i < str.length() ; i++)
         {
             char ch = str.charAt(i);
             String ros = str.substring(0,i) + str.substring(i+1);
             printPermutations(ros, ans + ch);
         }
	 }

	public static void main(String[] args) {
		String str = "abcd";
		printPermutations(str, "");
	}

}
