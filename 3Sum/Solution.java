import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        int j = 1;
        int k = 2;
        for(int i=0; i<nums.length; i++){
            int sum = nums[i]+nums[j]+nums[k];
            while(sum != 0 && j!= nums.length-1){
                while(k != nums.length-1 && sum != 0){
                    if(i!=j && j!=k && i!=k){
                        sum = nums[i]+nums[j]+nums[k];
                    }
                    k += 1;
                }
                j += 1;
                k = j+1;
            }
            List<Integer> triplet = new ArrayList<>();
            if(sum == 0 && i!=j && j!=k && i!=k) {
                triplet.add(nums[i]);
                triplet.add(nums[j]);
                triplet.add(nums[k]);
                set.add(triplet);
            }
            j=0;
            k=i+1;

        }
        for(List<Integer> list : set){
            ans.add(list);
        }
        return ans;
    }
}
