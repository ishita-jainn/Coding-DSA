// import java.util.*;

public class productofarray {
    public int[] prod(int[] nums){
        int n = nums.length;
        int[] arr = new int[n];
        arr[0] =1;
        for(int i=1;i<n;i++){
            arr[i] = nums[i-1]*arr[i-1];
        }
        int prod =1 ;
        for(int i=n-1;i>=0;i--){
            arr[i]*=prod;
            prod *=nums[i];

        }
        return arr;
    }
}
