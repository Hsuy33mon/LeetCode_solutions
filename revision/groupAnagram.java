package revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagram{
    public static void main(String[] args) {
        String[] strs = {"act","xyz","pots","tops","cat","stop","hat"};
        List<List<String>> ans1 = groupAnagrams(strs);
        for(List<String> a : ans1){
            System.out.println(a);
        }

    }

    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        

        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }

            StringBuilder key = new StringBuilder();
            for(int n:count){
                key.append(n).append("#");
            }
            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}