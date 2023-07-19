package BackTracking;
import java.util.*;

public class SubsequenceWithSumK {

    public static void sumk(int idx, ArrayList<Integer> al, int s, int sum, int n, int[] nums ){
        if(idx==n){
            if(s==sum){
                System.out.println(al);
            }
            return;
        }

        al.add(nums[idx]);
        s+=nums[idx];
        sumk(idx+1, al, s, sum, n, nums);
        s-=nums[idx];
        al.remove(al.size()-1);
        sumk(idx+1, al, s, sum, n, nums);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        ArrayList<Integer> al = new ArrayList<>();
        sumk(0, al, 0, 2, 3, arr);
        
        
    }
    
}
