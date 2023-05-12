public class MinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int r = nums.length -1;
        int l = 0;
        if(nums.length == 1){
            return nums[0];
        }
        if(nums[l]<nums[r]){
            return nums[l];
        }
        while(l<r){
            if(l==(r-1)){
                return Math.min(nums[r], nums[l]);
            }
            int mid = (r+l)/2;             
            if(nums[mid]>nums[r]){
                l = mid;
            }
            else{
                r = mid;
            }
        }
        return nums[l];
    }
    
}
