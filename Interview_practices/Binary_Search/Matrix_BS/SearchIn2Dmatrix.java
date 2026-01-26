package Interview_practices.Binary_Search.Matrix_BS;
// https://leetcode.com/problems/search-a-2d-matrix/
// Leetcode - 74
public class SearchIn2Dmatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = (matrix.length * matrix[0].length) - 1 ;
        int col = matrix[0].length;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            int r = mid/col;
            int c = mid%col;

            if(matrix[r][c] == target) return true;

            if(matrix[r][c] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return false;
    }
}
