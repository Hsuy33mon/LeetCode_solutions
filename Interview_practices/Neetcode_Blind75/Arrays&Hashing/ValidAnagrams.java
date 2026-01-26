
// https://neetcode.io/problems/is-anagram/question
public class ValidAnagrams {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;

        int[] count_s = new int[26];
        for(char c : s.toCharArray()){
            int index = getIndex(c);
            count_s[index]++;
        }

        for(int i=0; i<t.length(); i++){
            int index = getIndex(t.charAt(i));
            count_s[index]--;
            if(count_s[index] < 0) return false;
        }

        return true;
    }

    public int getIndex(char c){
        return Math.abs(c - 'a');
    }
}
