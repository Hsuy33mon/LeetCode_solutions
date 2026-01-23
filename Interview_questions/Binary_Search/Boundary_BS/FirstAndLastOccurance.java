package Interview_questions.Binary_Search.Boundary_BS;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
// Leetcode - 34

public class FirstAndLastOccurance {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1,-1};
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[2];

        int start = binary_search_left(nums,target,left,right);
        int end = binary_search_right(nums,target,left,right);
        result[0]=start;
        result[1]=end;
        return result;
    }

    public int binary_search_left(int[] nums, int target, int left, int right){
        while(left<right){
            int mid = left+(right-left)/2;

            if(nums[mid] >= target){
                right = mid;
            }else {
                left = mid +1 ;
            }
        }
        return (nums[left] == target) ? left : -1 ;
    } 

    public int binary_search_right(int[] nums, int target, int left, int right){
        while(left<right){
            int mid = left+(right-left+1)/2;

            if(nums[mid] <= target){
                left = mid;
            }else {
                right = mid - 1;
            }
        }
        return (nums[left] == target) ? left : -1;
    } 
    
}
