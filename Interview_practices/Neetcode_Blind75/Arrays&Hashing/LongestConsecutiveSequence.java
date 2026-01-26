

import java.util.HashSet;

// https://neetcode.io/problems/longest-consecutive-sequence/question?list=blind75
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for(int n:nums){
            set.add(n);
        }
        for(int s : set){
            if(!set.contains(s-1)){
                int current = s;
                int count = 1;
                while(set.contains(current+1)){
                    count++;
                    current = current+1;
                }
                max = Math.max(count,max);
            }
        }
        return max;
    }
}