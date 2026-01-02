import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3};
        int target = 6;
        int[] ans = sum(nums, target);
        for(int i : ans){
            System.out.print(i+ " ");
        }
    }

    public static int[] sum(int[] nums, int target){
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                ans[0] = map.get(diff);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }

    // public static int[] sum(int[] nums, int target){
    //     int[] ans = new int[2];
    //     for(int i=0; i <nums.length ; i++){
    //         for(int j = i; j < nums.length ; j++){
    //             if(nums[i] + nums[j] == target){
    //                 ans[0] = i;
    //                 ans[1] = j;
    //             }
    //         }
    //     }
    //     return ans;
    // }

   
}
