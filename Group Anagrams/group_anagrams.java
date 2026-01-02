// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// public class group_anagrams {

//     public static void main(String[] args) {
//         String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
//         List<List<String>> ans = groupAnagrams(strs);
//         for(List<String> s : ans){
//             System.out.println(s);
//         }
//     }
    
//     public static  List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> ans = new ArrayList<>();

//         Map<String,List<String>> map = new HashMap<>();
//         for(String str : strs){
//             char[] arr = str.toCharArray();
//             Arrays.sort(arr);
//             StringBuilder sb = new StringBuilder();

//             for (char c : arr) {
//                 sb.append(c);
//             }

//             if(map.containsKey(sb.toString())){
//                 List<String> temp_string2 = map.get(sb.toString());
//                 temp_string2.add(str);
//                 map.put(sb.toString(), temp_string2);
//             }else{
//                 List<String> temp_string = new ArrayList<>();
//                 temp_string.add(str);
//                 map.put(sb.toString(),temp_string);
//                 ans.add(map.get(sb.toString()));  // store relavent element in this key
//             }
//         }
//         return ans;

//     }
// }

