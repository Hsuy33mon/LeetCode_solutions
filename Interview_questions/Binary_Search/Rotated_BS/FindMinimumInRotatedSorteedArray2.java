package Interview_questions.Binary_Search.Rotated_BS;
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
//  Leetcode - 154
public class FindMinimumInRotatedSorteedArray2 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left<right){
            int mid = left + (right-left)/2;

            if(nums[mid] == nums[right]){
                right--;
            } else if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }

        }
        return nums[left];
    }
}
