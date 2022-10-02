package slidingWindow;

import java.util.HashMap;

/*
https://practice.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1

Given an input string & pattern string, find the count of anagrams of pattern in input string

 */
public class Anagrams_Occurances {
    static int search(String pat, String txt) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < pat.length(); i++){
            map.put(pat.charAt(i), map.getOrDefault(pat.charAt(i), 0) + 1);
        }

        int i = 0, j = 0, k = pat.length();
        int count = map.size(), ans = 0;

        while(j < txt.length()){
            if(map.containsKey(txt.charAt(j))){
                map.put(txt.charAt(j), map.get(txt.charAt(j)) - 1);
                if(map.get(txt.charAt(j)) == 0){
                    count--;
                }
            }

            if(j - i + 1 < k){
                j++;
            }

            else if(j - i + 1 == k){
                if(count == 0){
                    ans++;
                }
                if(map.containsKey(txt.charAt(i))){
                    map.put(txt.charAt(i), map.get(txt.charAt(i)) + 1);
                    if(map.get(txt.charAt(i)) == 1){
                        count++;
                    }
                }
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String txt = "aabaabaa";
        String pat =  "aaba";
        System.out.println(search(pat, txt));

        txt = "forxxorfxdofr";
        pat = "for";
        System.out.println(search(pat, txt));

        txt = "forxxfyrofr";
        pat = "for";
        System.out.println(search(pat, txt));
    }
}
