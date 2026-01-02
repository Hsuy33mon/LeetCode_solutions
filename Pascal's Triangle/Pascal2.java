import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal2 {
    public static void main(String[] args) {
        int rowIndex = 3;
        List<Integer> ans = generate(rowIndex);
        for(Integer i : ans){
            System.out.print(i+ " ");
        }
        
    }

    public static List<Integer> generate(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<rowIndex+1;i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int j=1; j<i; j++){
                list.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
            if(i>0) list.add(1);
            ans.add(list);
        }
        return ans.get(rowIndex);
    }
}
