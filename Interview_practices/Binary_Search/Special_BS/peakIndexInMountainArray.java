package Interview_practices.Binary_Search.Special_BS;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Leetcode - 852
public class peakIndexInMountainArray{
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while(left<right){
            int mid = left + (right - left)/2;
            if(arr[mid] < arr[mid+1]){
                left = mid +1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}