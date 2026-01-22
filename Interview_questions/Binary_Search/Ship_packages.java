package Interview_questions.Binary_Search;

// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
// Leetcode - 1011
public class Ship_packages {
    
    public static void main(String[] args) {
        int[] w = new int[]{1,2,3,4,5,6,7,8,9,10};
        int d = 5;
        System.out.println(shipWithinDays(w, d));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int left =0;
        int right = 0;

        for(int w: weights){
            right += w;
            left = Math.max(left, w);
        }

        
        while(left < right){
            int mid = left+ (right-left)/2;
            boolean flag = withinDays(weights, days, mid);
            if(flag){
                right = mid;
            }else{
                left = mid+1;
            }
        }

        return left;
    }

    public static boolean withinDays(int[] weights, int days, int mid){
        int count = 0;
        int d = 1;
        for(int i=0; i<weights.length; i++){
            if(weights[i]+count > mid){
                d ++;
                count = 0;
            }
            count += weights[i];
        }
        return d <= days;
    }
}
