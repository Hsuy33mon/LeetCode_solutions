package Interview_questions.Binary_Search.Parametric_BS;
// https://leetcode.com/problems/koko-eating-bananas/
//  Leetcode - 875
public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int n : piles){
            right = Math.max(right, n);
        }

        while(left < right){
            int mid = left + (right-left)/2;
            if(check(piles, mid, h)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return left;
    }

    public static boolean check(int[] piles, int mid, int h){
        int totalHours = 0;
        for(int p: piles){
            totalHours += (p+mid-1)/mid;
        }
        return totalHours<=h; 
    }
}
