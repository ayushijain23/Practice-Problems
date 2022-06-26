package array;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseVowels(str));
    }

    public static String reverseVowels(String s) {
        int len = s.length();
        int last = s.length() - 1;
        int first = 0;
        StringBuilder sb = new StringBuilder(s);
        while( first <= last && first < len && last < len && last >= 0 && first >= 0){
            if(sb.charAt(first) == 'a' || sb.charAt(first) == 'e'|| sb.charAt(first) == 'i'||sb.charAt(first) == 'o'||sb.charAt(first) == 'u'){
                if(sb.charAt(last) == 'a' || sb.charAt(last) == 'e'|| sb.charAt(last) == 'i'||sb.charAt(last) == 'o'||sb.charAt(last) == 'u'){
                    char ch = sb.charAt(last);

                    sb.setCharAt(last, sb.charAt(first));
                    sb.setCharAt(first, ch);
                    first++;
                    last--;
                }
                else{
                    last--;
                }
            }
            else{
                first++;
            }

        }
        return sb.toString();
    }
}
