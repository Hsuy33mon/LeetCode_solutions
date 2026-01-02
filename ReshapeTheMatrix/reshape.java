package ReshapeTheMatrix;

import java.util.ArrayList;
import java.util.List;

public class reshape {
    public static void main(String[] args) {
        // int[][] ans = matrixReshape(new int[][]{{1,2},{3,4}}, 1, 4);
        int[][] ans = matrixReshape(new int[][]{{1,2}}, 1, 1);
        for(int[] row: ans){
            for(int v : row){
                System.out.print(v + ",");
            }
            System.out.println();
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        // if(mat.length == 1) return mat;

        int origin_value = mat.length* mat[0].length;
        int reshape_value = r*c;
        int[][] ans = new int[r][c];

        if(origin_value!=reshape_value) return mat;
        int[] temp = new int[origin_value];

        int m =0;
        for(int[] row:mat){
            for(int v: row){
                temp[m] = v;
                m++;
            }
        }

        int n = 0;
        for(int i=0; i<r; i++){
            for(int j=0;j<c;j++){
                ans[i][j] = temp[n];
                n++;
            }
            
        }
        return ans;
    }

    public int[][] matrixReshape_v2(int[][] mat, int r, int c) {
        int origin_value = mat.length* mat[0].length;
        int reshape_value = r*c;
        if(origin_value!=reshape_value) return mat;

        int[][] ans = new int[r][c];
        int row = 0;
        int col = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0; j<mat[i].length;j++){
                ans[row][col] = mat[i][j];
                col++;

                if(col==c) {
                    col=0;
                    row++;
                }
            }
        }

        return ans;
    }
}
