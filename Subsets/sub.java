package Subsets;

import java.util.*;
import java.util.stream.Collectors;

public class sub {
    public static void main(String[] args) {
        List<List<Integer>> ans = subsets(new int[]{1,2,3});
        for(List<Integer> row: ans){
            System.out.print(row+", ");
        }
    }
    // Input: nums = [1,2,3]
    // Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

    // public static Set<List<Integer>> subsets(int[] nums , Set<List<Integer>> ans) {
    //     List<Integer> allSub = Arrays.stream(nums).boxed().collect(Collectors.toList());
    //     ans.add(allSub);
        
    //     if(nums.length == 1) return ans;
    //     for(int i=0;i<nums.length-1;i++){
    //         if(nums.length>2){
    //             ans.add(Arrays.asList(nums[i],nums[i+1]));
    //         }
    //         ans.add(Arrays.asList(nums[i]));
    //     }

    //     return subsets(Arrays.copyOfRange(nums, 1, nums.length), ans);
    // }

    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public static void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> ans){
        ans.add(new ArrayList<>(current));
        for(int i=index; i<nums.length; i++){
            current.add(nums[i]);
            backtrack(i+1, nums, current, ans);
            current.remove(current.size()-1);
        }
    }
}
