package LongestSubStringWithoutReaptingCharacters;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // System.out.println(lengthOfLongestSubstring_v1("abcabcbb"));
        // System.out.println(lengthOfLongestSubstring_v1("pwwkew"));
        // System.out.println(lengthOfLongestSubstring_v1("dvdf"));
        // System.out.println(lengthOfLongestSubstring_v1("   "));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(lengthOfLongestSubstring("   "));
    }

    public static int lengthOfLongestSubstring_v1(String s){
        if(s.isEmpty()) return 0;
        if(s.trim().isEmpty()) return 1;
        int max = 0;
        String subString = "";
        Set<String> set = new HashSet<>();
        for(int i=0; i<s.length();i++){
            for(int j=i+1; j<=s.length();j++){
                subString = s.substring(i,j);
                set.add(subString);
            }
        }
        for(String str : set){
            if(isValid(str)){
                max = Math.max(max, str.length());
            }
        }
        return max;
    }

    public static boolean isValid(String s){
        int[] count = new int[65];
        for(int i=0;i<s.length();i++){
            int index = Math.abs(s.charAt(i) - 'a');
            if(count[index]==1){
                return false;
            }
            count[index]++;
        }
        return true;
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int pointer = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(pointer));
                pointer++;
            }
            set.add(c);
            max = Math.max(max,set.size());
        }
        return max;
    }
}
