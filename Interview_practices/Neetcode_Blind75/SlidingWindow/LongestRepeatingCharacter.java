package Interview_practices.Neetcode_Blind75.SlidingWindow;

import java.util.HashMap;
// https://neetcode.io/problems/longest-repeating-substring-with-replacement/question
public class LongestRepeatingCharacter {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int max_freq = 0;
        int j = 0;
        int ans = 0;

        for(int i = 0; i<s.length(); i++){
            Character c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            max_freq = Math.max(max_freq,map.get(c));

            int len = i - j + 1;
            if(len - max_freq > k){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                j++;
            }

            ans = Math.max(ans,i-j+1);
        }
        return ans; 
    }
}
