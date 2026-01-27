package Interview_practices.Neetcode_Blind75.TwoPointers;
// https://neetcode.io/problems/max-water-container/question
public class ContainerWithMostWater {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = 0;

        while(left<right){

            int temp = (right - left) * Math.min(heights[left], heights[right]);
            max = Math.max(max, temp);

            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
