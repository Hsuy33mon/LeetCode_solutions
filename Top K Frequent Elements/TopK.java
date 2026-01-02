import java.util.*;

public class TopK {

    public static void main(String[] args) {

        // int[] nums = new int[]{1,1,1,2,2,3};
        int[] nums = new int[]{5,3,1,1,1,3,5,73,1};
        // int[] nums = new int[]{4,1,-1,2,-1,2,3};
        int k = 3;
        int[] ans =  topKFrequent_with_Heap(nums,k);
        // topKFrequent(nums, k);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }

    public static int[] topKFrequent_with_HashMap(int[] nums, int k){        
        int[] ans = new int[k];
        int n =0;
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,List<Integer>> reversedMap = new HashMap<>();
        if(k == 1 && k == nums.length) return new int[]{nums[0]};
        if(k == 2 && k == nums.length) return new int[]{nums[0], nums[1]};
        
        for(int i =0; i< nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        for (Integer key : map.keySet()) {
            reversedMap.computeIfAbsent(map.get(key), t -> new ArrayList<>()).add(key);
        }
        Map<Integer, List<Integer>> sorted =new TreeMap<>(Collections.reverseOrder());
        sorted.putAll(reversedMap);
        
        System.out.println(sorted); // {4=[1], 2=[3, 5], 1=[73]}
        for (List<Integer> list : sorted.values()) {
            result.addAll(list); // [1,3,5,73]
        }
        for(int i= 0 ; i < k ; i++){
            ans[i] = result.get(i);
        }

        return ans;

    }

    public static int[] topKFrequent_with_Heap(int[] nums, int k){
        int[] ans = new int[k];
        Map<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> (a[1] - b[1]));

        for(int key : map.keySet()){
            heap.offer(new int[]{key, map.get(key)});
            if(heap.size() > k){
                heap.poll(); //remove the smallest element in heap
            }   
        }

        for(int i = k-1; i>=0 ; i--){
            ans[i] = heap.poll()[0];
        }
        return ans;
    }
}
