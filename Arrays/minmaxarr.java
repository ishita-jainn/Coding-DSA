
import java.util.*;

public class minmaxarr {
    public static void main(String[] args){
        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE;
        int[] arr1 = { -12, -1, -2, -6, -100, -4};
        for(int i= 0;i<arr1.length;i++){
            if(arr1[i]<min)
                min = arr1[i];
            else if(arr1[i]>max)
                max = arr1[i];
        }
        System.out.println(max +" "+  min);

    }
}
