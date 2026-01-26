

import java.util.ArrayList;
import java.util.List;
// https://neetcode.io/problems/string-encode-and-decode/question
public class EncodeAndDecodeStrings {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s: strs){
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }    

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int p = 0;
        while(p<str.length()){
            int length = 0; 

            while(str.charAt(p) != '#'){
                length = length*10 + (str.charAt(p) - '0');
                p++;
            }
            
            p ++;
            String s = str.substring(p,length+p);
            ans.add(s);
            p+= length;
        }
        return ans;
    }
}
