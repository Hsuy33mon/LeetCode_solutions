package IntersectionOfTwoArrays2;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] ans = intersection(new int[]{1,2,2,1}, new int[]{2,2});
        for(int i: ans){
            System.out.println(i+",");
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int i : nums1){
            count.put(i, count.getOrDefault(i, 0)+1);
        }
        List<Integer> temp_ans = new ArrayList<>();
        for(int n: nums2){
            if(count.containsKey(n) && count.get(n) != 0){
                temp_ans.add(n);
                int c = count.get(n) - 1;
                count.put(n, c);
            }
        }
        
        int[] ans = new int[temp_ans.size()];
        int indx = 0;
        for(int v : temp_ans){
            ans[indx++] = v;
        }

        return ans;
    }
}
