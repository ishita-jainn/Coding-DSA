package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicatesSubsets {

    
    public void subs(List<List<Integer>> lg, List<Integer> li, int idx, int[] nums){

        lg.add(new ArrayList<Integer>(li));

        for(int i=idx;i<nums.length;i++){
            if(i!=idx && nums[i]==nums[i-1]){
                continue;
            }
            li.add(nums[i]);
            subs(lg,li,i+1,nums);
            li.remove(li.size()-1);

        }
    }


    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> lg = new ArrayList<>();
        subs(lg, new ArrayList<>(),0, nums );

        return lg;
        
    }
    
}
