public class removeElement {

    public static int removeEle(int[] nums, int val){
        int k = 0;
        for(int i = 0; i<nums.length;i++){
            if (nums[i] != val){
                nums[k] =nums[i];
                k+=1;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int l = removeEle(nums, val);
        for(int i =0;i<l;i++){
            System.out.println(nums[i]);
        }
    }
    
}