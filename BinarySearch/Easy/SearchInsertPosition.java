package BinarySearch.Easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
            
        int low = 0;
        int high = nums.length-1;

        if(nums[high]<target){
            return high+1;
        }
        else if(nums[low]>target){
            return low;
        }

        while(low<=high){
            int mid = (low+high)/2;

            if(target == nums[mid]){
                return mid;
            }
            else if(nums[mid]>target && nums[mid-1]<target){
                return mid;
            }

            else if(target>nums[mid]){
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
            
        }  
        return -1;     
        
    }
    
}
