package SingleNum;

import java.util.HashMap;
import java.util.Map;

public class single {
    public static void main(String[] args) {
        int[] arr = new int[]{4,5,5,2,2,4,3};
        // System.out.println(singleNumber(arr));
        System.out.println(optimal_solution(arr));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0) + 1);
        }
        for(int key: map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return 0;
    }

    public static int optimal_solution(int[] nums){
        int result = 0;

        for(int n : nums){
            result ^= n;
        }
        return result;
    }
}
