package Interview_practices.Neetcode_Blind75.GreedyAlgorithm;
// https://neetcode.io/problems/maximum-subarray/question?list=blind75
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int max = -1001;
        int cursum = -1001;
        for(int n: nums){
            cursum = Math.max(n, n+cursum);
            max = Math.max(max,cursum);
        }
        return max;
    }
}
