package Interview_practices.Neetcode_Blind75.SlidingWindow;

import java.util.HashSet;
// https://neetcode.io/problems/longest-substring-without-duplicates/question
public class LongestSubstringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int j = 0;

        for(int i=0; i<s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            max = Math.max(set.size(), max);
        }
        return max;
    }
}
