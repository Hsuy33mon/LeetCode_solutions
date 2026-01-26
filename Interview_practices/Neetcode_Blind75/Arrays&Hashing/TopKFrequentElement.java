package Interview_practices.Neetcode_Blind75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
// https://neetcode.io/problems/top-k-elements-in-list/history
public class TopKFrequentElement {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        int[] ans = new int[k];
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        for(int key: map.keySet()){
            if(bucket[map.get(key)] == null){
                bucket[map.get(key)] = new ArrayList<>();
            }
            bucket[map.get(key)].add(key);
        }

        int index = 0;
        for(int i=bucket.length-1; i>= 0; i--){
            if(bucket[i] != null && index<k){
                for(int n : bucket[i]){
                    ans[index++] = n;
                }
            }
        }
        return ans;
    }
}
