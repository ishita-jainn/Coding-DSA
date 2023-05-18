package Strings;

public class NextPermutation {
    public void nextPermutation(int[] nums){
        int i,j;
        int len = nums.length -1;

        for(i =len-1; i>=0;i--){
            if(nums[i]<nums[i+1]){
                break;
            }    
        }
        if(i>=0){
            for(j = len; j>i;j--){
                if(nums[j]>nums[i]){
                    break;
                }
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1,len);
     
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end){
        while(start<end){
            swap(nums, start++, end--);
        }
    
    }
    
}
