package Leetcode.RemoveAllOccuranceChar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // System.out.println(remove("apple", 'p'));
        List<List<Integer>> ans = generate(5);
        for(List<Integer> i: ans){
            System.out.println(i);
        }
    }

    // public static String remove(String s, char c){
    //     return temp(s,c,0,"");
    // }

    // public static String temp(String s,char c, int i,String t){
    //     if(i >= s.length()) return t;
    //     if(s.charAt(i) != c){
    //         t+=s.charAt(i);
    //     }
    //     return temp(s,c,++i,t);
    // }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows == 1){
            ans.add(Arrays.asList(1));
            return ans;
        }else if(numRows == 2){
            ans.add(Arrays.asList(1));
            ans.add(Arrays.asList(1,1));
            return ans;
        }
        ans.add(Arrays.asList(1));
        ans.add(Arrays.asList(1,1));

        for(int i=2;i<numRows;i++){
            int[] temp = new int[i+1];
            temp[0]=1;
            temp[i]=1;
            int indx = 1;
            for(int j=0; j<ans.get(i-1).size(); j++){
                temp[indx] = ans.get(i-1).get(j) + ans.get(i-1).get(j+1);
                indx++;
            }
        }
        return ans;
    }
}