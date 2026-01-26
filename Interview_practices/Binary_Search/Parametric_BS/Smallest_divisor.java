package Interview_practices.Binary_Search.Parametric_BS;
// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
// Leetcode - 1283
public class Smallest_divisor {
    public static int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;
        for(int n: nums){
            right = Math.max(n,right);
        }
    
        while(left<right){
            int mid = left+ (right-left)/2;
            if(check(nums,mid,threshold)){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }

    public static boolean check(int[] nums, int divisor, int threshold){
        int result = 0;
        for(int n: nums){
            result += (n+divisor-1)/divisor;
        }
        return result<=threshold;
    }
}
