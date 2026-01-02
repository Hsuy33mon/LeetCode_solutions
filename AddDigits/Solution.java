package Leetcode.AddDigits;

public class Solution {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        int t = num%10;
        if(num == 0) return t;
        t += addDigits(num/10);
        if(t > 9)t = addDigits(t);
        return t;
    }

}