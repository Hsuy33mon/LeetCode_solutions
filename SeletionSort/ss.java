package SeletionSort;
public class ss {
	
	public static void sort(int[] n) {
		
		int i = 0;
		int min_index = findMin(i,n);
		
		while(i<n.length) {
			min_index = findMin(i,n);
//			System.out.print(n[i]);
			int temp = n[i];
			n[i] = n[min_index];
			n[min_index] = temp;
//			System.out.print(n[i]);
//			System.out.print(n[min_index]);
			i++;
			
//			System.out.print(min_index);
		}
	}
	
	public static int findMin(int start,int[] n) {
		int min_index = start ;
		int min = n[start];
		for(int i =start;i<n.length-1;i++) {
			for(int j = i+1;j<n.length;j++) {
				if(min>n[j]) {
					min_index = j;
					min = n[j];
				}
			}
		}
		return min_index;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5,3,2,1,4};
        // int[] arr = {1,2,3,5,4};
		sort(arr);
		for(int n : arr) {
			System.out.print(n+" ");
		}
		// System.out.print(findMin(2,arr));
		
	}
}
