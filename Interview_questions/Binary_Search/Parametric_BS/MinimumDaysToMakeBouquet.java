package Interview_questions.Binary_Search.Parametric_BS;
// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
// Leetcode - 1482
public class MinimumDaysToMakeBouquet {
     public int minDays(int[] bloomDay, int m, int k) {
        if((long) m*k > bloomDay.length) return -1;
        int left = bloomDay[0];
        int right = 0;
        for(int d : bloomDay){
            left = Math.min(left,d);
            right = Math.max(right,d);
        }

        while(left < right){ 
            int mid = left+ (right-left)/2;    

            if(check(bloomDay,mid,k,m)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean check(int[] bloomDay, int mid,int k,int m){
        int count = 0;
        int bouquet = 0;
        for(int i = 0; i<bloomDay.length; i++){
            if(bloomDay[i] > mid){
                count = 0;
            }
            if(bloomDay[i] <= mid){
                count++;
            }
            if(count == k ){
                bouquet++;
                count = 0;
            }
        }
        return bouquet >= m;
    }
}
