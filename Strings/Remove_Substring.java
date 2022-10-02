package Strings;

import java.util.Stack;

public class Remove_Substring {
    public static String removeOccurrences(String s, String part) {
        Stack<Character> stack1 = new Stack<>();
        StringBuilder res = new StringBuilder();
        int size1 = s.length();
        int size2 = part.length();

        for(int i = 0; i < size1; i++){
            stack1.push(s.charAt(i));

            if(stack1.size() >= size2){
                int k = size2;
                StringBuilder sb = new StringBuilder();
                while(k-- > 0){
                    sb.append(stack1.pop());
                }
                String str = sb.reverse().toString();
                if(!str.equals(part)){
                    for(int j = 0; j < size2; j++){
                        stack1.push(str.charAt(j));
                    }
                }
            }
        }


        while(!stack1.isEmpty()){
            res.append(stack1.pop());
        }

        return res.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeOccurrences(s, part));
    }
}
