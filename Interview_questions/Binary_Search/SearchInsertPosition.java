package Interview_questions.Binary_Search;
// https://leetcode.com/problems/search-insert-position/description/
// Leetcode - 35
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while(left<right){
            int mid = left + (right-left)/2 ;
            if(nums[mid] >= target){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return left;
    }
}
