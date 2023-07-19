package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void comb(int idx, int target, int[] nums, ArrayList<Integer> al, List<List<Integer>> glist){

        if(idx==nums.length){
            if(target==0){
                glist.add(new ArrayList<>(al));
            }
            return;
        }

        if(nums[idx]<=target){
            al.add(nums[idx]);
            comb(idx, target - nums[idx],nums,al,glist);
            al.remove(al.size()-1);
        }
        comb(idx+1, target,nums,al,glist);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> glist = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        comb(0, target,candidates,al,glist);

        return glist; 
    }
    
}
