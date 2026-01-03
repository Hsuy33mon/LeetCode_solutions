package IntersectionOfTwoArrays;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] ans = intersection(new int[]{1,2,2,1}, new int[]{2,2});
        for(int i: ans){
            System.out.println(i+",");
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int i : nums1){
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int j : nums2){
            if(set1.contains(j)){
                set2.add(j);
            }
            
        }
        int[] ans = new int[set2.size()];
        int indx = 0;
        for(int s: set2){
            ans[indx++] = s;
        }
        return ans;
    }
}
