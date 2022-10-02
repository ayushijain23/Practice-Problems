package slidingWindow;

import java.util.HashMap;
/*
https://www.geeksforgeeks.org/find-the-longest-substring-with-k-unique-characters-in-a-given-string/

find length of longest substring with k unique characters
 */
public class Longest_Substring_UniqueKCharcaters {
    public static int longestkSubstr(String s, int k) {
        // code here
        int len = s.length();
        int i = 0, j = 0, maxLength = -1;
        char ch[] = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        while(j < len){
            map.put(ch[j], map.getOrDefault(ch[j], 0) + 1);

            if(map.size() < k){
                j++;
            }

            else if(map.size() == k){
                maxLength = Math.max(maxLength, j - i + 1);
                j++;
            }

            else if(map.size() > k){
                while(map.size() > k){
                    map.put(ch[i], map.get(ch[i]) - 1);
                    if(map.get(ch[i]) == 0){
                        map.remove(ch[i]);
                    }
                    i++;
                }

                if(map.size() == k){
                    maxLength = Math.max(maxLength, j - i + 1);
                }
                j++;
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(longestkSubstr(s, k));
    }
}
