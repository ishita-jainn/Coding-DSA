package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class subsequence {
    public void subset(List<List<Integer>> listgrand, ArrayList<Integer> list, int[] nums, int idx){


        if(idx ==nums.length){
            listgrand.add(new ArrayList<>(list));
            return;
        }
        
        list.add(nums[idx]);
        subset(listgrand, list, nums, idx+1);
        list.remove(list.size()-1);
        subset(listgrand, list, nums, idx+1);
        
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subset(list, new ArrayList<>(),nums,0);
        return list;
    }
        
    
}
