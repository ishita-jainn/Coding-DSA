package Array2D;
import java.util.*;


public class ZigZagTraversal {

    public static void ZigZag(int[][]matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>(row+col-1);

        for(int i=0;i<row+col-1;i++){
            al.add(new ArrayList<Integer>());

        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                (al.get(i+j)).add(matrix[i][j]);
            }
        }
        for(int i=0;i<al.size();i++){
            for(int j= al.get(i).size()-1;j>=0;j--){
                System.out.print(al.get(i).get(j)+ " ");
            }
            System.out.println();
        }
        
    
    }
    public static void main(String[]args){

        int[][] matrix =  {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};        
        ZigZag(matrix);

    }

    
}
