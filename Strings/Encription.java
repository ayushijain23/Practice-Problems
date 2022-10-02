package Strings;
/*
https://www.geeksforgeeks.org/encrypt-the-given-string-with-the-following-operations/
 */


import java.util.HashMap;

public class Encription {
    public static String encryptStr(String str, int n, int x){
        int freq[] = new int[26];
        int max = 26;
        x = x % max;
        char ch[] = str.toCharArray();
        for(int i = 0; i < n; i++){
            freq[ch[i] - 'a']++;
        }

        for(int i = 0; i < n; i++){
            if(freq[ch[i] - 'a'] % 2 == 0){
                int inc  = (ch[i] - 'a' + x) % max;
                ch[i] = (char)(inc + 'a');
            }

            else{
                int dec = ch[i] -'a' - x;
                if(dec < 0){
                    dec = dec + max;
                }

                ch[i] = (char)('a' + dec);

            }
        }
       return String.valueOf(ch);
    }

    public static String byHashMap(String str, int n, int x){
        HashMap<Character, Integer> map = new HashMap<>();
        x = x % 26;

        char ch[] = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
        }

        for(int i = 0; i < n; i++){
            if(map.get(ch[i]) % 2 == 0){
                int temp = (ch[i] -'a'+ x ) % 26;
                ch[i] = (char)(temp + 'a');
            }
            else{
                int temp = ch[i] - 'a' - x;
                if(temp < 0){
                    temp+= 26;
                }
                ch[i] = (char)(temp + 'a');
            }
        }

        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        String s = "abcdab";
        int n = s.length();
        int x = 3;
        System.out.println(encryptStr(s, n, x));
        System.out.println(byHashMap(s, n, x));
    }
}
