package Interview_practices.Neetcode_Blind75.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// https://neetcode.io/problems/three-integer-sum/question
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length - 1;

            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            while(left<right){
                int sum = nums[left] + nums[right] + nums[i];

                if(sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    temp.add(nums[i]);
                    ans.add(temp);
                    
                    while(left<right && nums[left] == nums[left+1]) left++;
                    while(left<right && nums[right] == nums[right-1]) right--;

                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return ans;
    }
}
