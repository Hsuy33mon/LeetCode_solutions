package Interview_practices.Binary_Search.Matrix_BS;

public class SearchA2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while(col>=0 && row< matrix.length){
            if(matrix[row][col] == target) return true;

            if(matrix[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}
