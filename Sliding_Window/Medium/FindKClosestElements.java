package Sliding_Window.Medium;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {


        List<Integer> list = new ArrayList<>();        
        int l=0;
        int r=nums.length-1;


        while(r-l>=k){
            if((Math.abs(nums[l]-x)>Math.abs(nums[r]-x))){
                l++;
                
            }
            else{
                r--;
            }           
            
        }
        for(int i=l;i<=r;i++){
            list.add(nums[i]);
        }

        return list;
        
    }
    
}
