package Sliding_Window.Easy;

import java.util.HashSet;

public class ContainsDuplicate11 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int r =0;
        int l=0;

        HashSet<Integer> win = new HashSet<>();

        while(r<nums.length){
            if(r-l>k){
                win.remove(nums[l]);
                l++;
            }
            if(win.contains(nums[r])){
                return true;
                
            }
            else{
                win.add(nums[r]);
                r++;
            }
        }
        return false;
    }
    
}
