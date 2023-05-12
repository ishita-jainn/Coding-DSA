package Array2D;
import java.util.*;


public class setMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int r= matrix.length;
        int c =matrix[0].length;

        int[] rows = new int[r];
        int[] cols = new int[c];

        Arrays.fill(rows,1);
        Arrays.fill(cols,1);

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    rows[i] =0;
                    cols[j]=0;
                }
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if((rows[i]==0)||(cols[j]==0)){
                    matrix[i][j]= 0;
                }
            }
        }
    }
    
}
