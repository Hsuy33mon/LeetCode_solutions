

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
// https://neetcode.io/problems/anagram-groups/history
public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for(String s: strs){
            int[] count = new int[26];

            for(char c: s.toCharArray()){
                count[c-'a']++;
            } 

            StringBuilder sb = new StringBuilder();
            for(int i: count){
                sb.append(i).append('#');
            }
            String code = sb.toString();

            map.computeIfAbsent(code,k -> new ArrayList<>()).add(s);
        }

        for(List<String> group : map.values()){
            ans.add(group);
        }
        return ans;
    }
}
