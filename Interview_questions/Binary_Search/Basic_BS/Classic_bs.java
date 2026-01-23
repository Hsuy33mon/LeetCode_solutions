package Interview_questions.Binary_Search.Basic_BS;

public class Classic_bs {
    
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,4,6,8,10};
        int target = 4;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(target > nums[mid]){
                left = mid+1;
            }else if(target < nums[mid]){
                right = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
