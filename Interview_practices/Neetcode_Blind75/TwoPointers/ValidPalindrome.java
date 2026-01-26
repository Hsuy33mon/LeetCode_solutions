package Interview_practices.Neetcode_Blind75.TwoPointers;
// https://neetcode.io/problems/is-palindrome/question?list=blind75
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
