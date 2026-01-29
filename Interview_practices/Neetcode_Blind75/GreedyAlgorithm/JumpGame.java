package Interview_practices.Neetcode_Blind75.GreedyAlgorithm;
// https://neetcode.io/problems/jump-game/question
public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        int lastIndex = nums.length - 1;
        for(int i=0; i<nums.length ; i++){
            if(i <= maxReach) maxReach = Math.max(maxReach, i + nums[i]);
            else return false;
        }
        return maxReach>=lastIndex;
    }
}
