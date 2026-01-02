package MergeSortedArrays;

public class merge {

    public static int[] separate(int[] n){
        
        int middle = n.length/2;
        int[] ans = new int[n.length];
        int k = 0;
        int[] t = new int[middle];
        while(middle>1){
            t = new int[middle];
            for(int i = 0;i<middle;i++){
                t[i] = n[i];
            }
            // t = sort(t);
            // for(int j = 0;j<middle;j++){
            //     ans[k] = t[j];
            //     k++;
            // }
            middle = middle/2;
        }
        
        return separate(t);
    }

    public static int[] sort(int[] n){
        for(int i = 0;i<n.length;i++){
            for(int j =i+1;j<n.length;j++){
                if(n[i]>n[j]){
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] arr = {2,8,5,3,9,4,1,7};
        int[] ans = separate(arr);
		
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
    }
}
