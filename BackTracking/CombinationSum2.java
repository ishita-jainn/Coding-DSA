package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum2 {

    // TLE
    public static void comb(int idx, int target, int[] nums, ArrayList<Integer> al, Set<List<Integer>> glist){

        if(idx==nums.length){
            if(target==0){
                // Collections.sort(al);
                glist.add(new ArrayList<>(al));
            }
            return;
        }

        if(nums[idx]<=target){
            al.add(nums[idx]);
            comb(idx+1, target - nums[idx],nums,al,glist);
            al.remove(al.size()-1);
        }
        comb(idx+1, target,nums,al,glist);

    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> glist = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(candidates);
        
        comb(0, target,candidates,al,glist);
        List<List<Integer>> ans = new ArrayList<>(glist);

        return ans; 
    }

    //final
    public static void comb(int idx, int target, int[] nums, ArrayList<Integer> al, List<List<Integer>> glist){
       
        if(target==0){
            glist.add(new ArrayList<>(al));
            return;
        }       

        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            if(nums[i]>target) break;

            al.add(nums[i]);
            comb(i+1, target - nums[i],nums,al,glist);
            al.remove(al.size()-1);
        }

    }
    public List<List<Integer>> combinationSum22(int[] candidates, int target) {
        List<List<Integer>> glist = new ArrayList<>();
        Arrays.sort(candidates);        
        comb(0, target,candidates, new ArrayList<>(),glist);

        return glist;         
    }
    
}
