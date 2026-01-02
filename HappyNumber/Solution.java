package Leetcode.HappyNumber;

public class Solution {
    public static void main(String[] args) {
        // System.out.println(isHappy(19));
        System.out.println(maxArr(new int[]{5,4,-1,7,10},4));
    }

    public static int maxArr(int[] nums,int k){
        int max = 0;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        max = sum / 4;

        for(int i=k; i<nums.length; i++){
            sum += nums[i];
            sum -= nums[i - k];
            max = Math.max(max, sum);
        }
        return max;
    }

//  Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1

    // public static boolean isHappy(int n) {
    //     return true;
        
    // }

    // public static void isHappy_1(int n){
    //     int remainder = n %10;
    //     int q = n/10;

    // }
}
