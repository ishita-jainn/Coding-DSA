package Sliding_Window.Medium;

public class MinSizeSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen =Integer.MAX_VALUE;
        int l=0;
        int sum =0;
        int r =0;
        int len =0;
        for(r=0;r<nums.length;r++){
            
            sum+=nums[r];            

            while(sum>=target){
                len = r-l+1;
                
                if(len<minlen){
                    minlen =len;
                }
                sum-=nums[l];
                l++;
                
            }   
            
        }

        return Math.min(len,minlen);
    
        
    }
    
}
