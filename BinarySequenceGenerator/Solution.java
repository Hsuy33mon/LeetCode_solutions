package BinarySequenceGenerator;

import java.util.ArrayList;
import java.util.List;


public class Solution {
    static List<List<Integer>> ans = new ArrayList<>();
    public static void main(String[] args) {
        // List<List<Integer>> ans = generate(3);
        generate_using_recurrsion(2, 0, new ArrayList<>());
        for(List<Integer> row : ans){
            System.out.println(row);
        }
    }

    // public static List<List<Integer>> generate(int n){
    //     List<List<Integer>> ans = new ArrayList<>();
    //     int total = (int) Math.pow(2, n);
        
    //     for(int i=0; i<total; i++){
    //         List<Integer> temp = new ArrayList<>();
    //         int shift = n-1;
    //         while(shift>=0){
    //             int bit = (i>>shift) & 1;
    //             temp.add(bit);
    //             shift--;
    //         }
    //         ans.add(temp);
    //     }
    //     return ans;
    // }

    
    public static void generate_using_recurrsion(int n, int target, List<Integer> temp){

        if(target == n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(0);
        generate_using_recurrsion(n,target+1,temp);
        temp.remove(target);
        
        temp.add(1);
        generate_using_recurrsion(n,target+1,temp);
        temp.remove(target);
    }
}
