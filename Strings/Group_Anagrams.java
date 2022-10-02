package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
https://leetcode.com/problems/group-anagrams/
 */
public class Group_Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char ch[] = new char[26];
            char temp[] = str.toCharArray();
            for(int i = 0; i < temp.length; i++){
                ch[temp[i] - 'a']++;
            }
            String key = String.valueOf(ch);
            System.out.println("Key is "+key);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> groups = groupAnagrams(strs);
        System.out.println(groups);

    }
}
