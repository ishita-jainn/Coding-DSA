package Sliding_Window.Medium;

import java.util.HashSet;

public class MaximumUniqueSubarray {
    public int maximumUniqueSubarray(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int l =0;
        int r =0;
        int sum =Integer.MIN_VALUE;
        int sum1 = 0;
       
        while(r<nums.length){            
            if(set.contains(nums[r])){
                if(sum1>sum){
                    sum = sum1;
                }
                sum1= sum1 - nums[l];
                set.remove(nums[l]);                
                l++;
                
            }
            else{
                set.add(nums[r]);
                sum1+=nums[r];
                r++;
                
            }

        }
        return Math.max(sum,sum1);
    }
    
}
