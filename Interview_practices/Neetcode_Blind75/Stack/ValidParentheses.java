package Interview_practices.Neetcode_Blind75.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

// https://neetcode.io/problems/validate-parentheses/question
public class ValidParentheses {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()) return false;
                if(map.get(stack.peek()) != s.charAt(i)){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
