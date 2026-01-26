package Interview_practices.Binary_Search.Special_BS;
// https://leetcode.com/problems/find-peak-element/
// Leetcode - 162
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left<right){
            int mid = left+ (right-left)/2;
            if(nums[mid] > nums[mid + 1]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}
