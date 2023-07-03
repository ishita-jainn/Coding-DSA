package Recursion;

public class MazePaths {

    public static int path(int i, int j, int m , int n){
        if(i==m-1 && j==n-1){
            return 1;
        }

        if(i==m || j==n){
            return 0;
        }

        int rightPath = path(i+1, j, m, n);

        int downPath = path(i, j+1, m, n);

        return rightPath+downPath;
    }

    public static void main(String[] args) {
        System.out.println(path(0,0,3,3));
            
    }
    
}
