import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal {
    public static void main(String[] args) {
        int numRows = 1;
        List<List<Integer>> ans = generate(numRows);

        for(List<Integer> i : ans){
            for(Integer j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
            ans.add(Arrays.asList(1));

            if(numRows > 1){
                for(int i = 1;i<numRows;i++){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(0,1);
                    for(int k = 1 ; k < i ; k++){
                        int value = ans.get(i-1).get(k-1) + ans.get(i-1).get(k);
                        temp.add(value);
                    }
                    temp.add(i,1);
                    ans.add(temp);
                }
            }
            
        return ans;
    }


    public static List<List<Integer>> generate_optimal(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int j=1; j<i; j++){
                list.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
            if(i>0) list.add(1);
            ans.add(list);
        }
        return ans;
    }
}
