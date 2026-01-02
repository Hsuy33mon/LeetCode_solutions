package FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class fizzbuzz {
    public static void main(String[] args) {
        List<String> ans = fizzBuzz(5);
        for(String s : ans){
            System.out.print(s + " ");
        }
    }

    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        int temp = 1;
        while(temp <= n){
            if(temp%15 == 0) {
                ans.add("FizzBuzz");}
            else if(temp%3 == 0 ) {
                ans.add("Fizz");}
            else if(temp%5 == 0) {
                ans.add("Buzz");}
            else {
                int t =  temp;
                ans.add(String.valueOf(t));
            }
            temp++;
        }
    
        return ans;
    }
}