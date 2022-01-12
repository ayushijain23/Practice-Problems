package Strings;

public class StringEqualExample {
	
	
	public static void main(String[] args) {
		String A = "ABC";
		String B = "ABC";
		String C = new String("ABC");
		String D = new String("ABC");
		
		System.out.println(A == B);               // true
		System.out.println(A.equals(B));        //true
		System.out.println(A == C);            //false
		System.out.println(C == D);             //false
		System.out.println(C.equals(D));         //true
		
         
	}

}
