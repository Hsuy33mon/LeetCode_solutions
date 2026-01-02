package HouseRobber;

import java.util.ArrayList;
import java.util.List;

public class robber {

    public static void main(String[] args) {
        System.out.println(rob2(new int[]{1,2,3}));
        // System.out.println(rob(new int[]{2,1,1,2}));
        // System.out.println(rob(new int[]{1,2,3,1}));
    }

    public static int rob2(int[] nums) {
        int n = nums.length;
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i< nums.length; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }
        return dp[n-1];
    }
    
    public static int rob(int[] nums) {
        int n = nums.length;
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i< nums.length; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }
        return dp[n-1];
    }

}
