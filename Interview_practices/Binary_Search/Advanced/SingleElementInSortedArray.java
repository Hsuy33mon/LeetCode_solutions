package Interview_practices.Binary_Search.Advanced;
// https://leetcode.com/problems/single-element-in-a-sorted-array/
// Leetcode - 540
public class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left<right){
            int mid = left+(right-left)/2;
            if(mid%2 == 1) mid--;
            if(nums[mid] == nums[mid+1]){
                left = mid +2;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}
