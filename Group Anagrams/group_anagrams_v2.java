import java.util.*;

public class group_anagrams_v2 {

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupAnagrams(strs);
        for (List<String> group : ans) {
            System.out.println(group);
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            // frequency count of 26 lowercase letters
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            // build unique key like "1#0#0#..."
            StringBuilder key = new StringBuilder();
            for (int num : count) {
                key.append(num).append('#');
            }

            map.computeIfAbsent(key.toString(), k -> new ArrayList<>())
               .add(str);
        }

        return new ArrayList<>(map.values());
    }
}
