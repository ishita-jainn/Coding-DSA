import java.lang.Math;
public class firstandlastelement {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        int rightptr = nums[n-1];
        int leftptr = nums[0];
        int midptr = (int)Math.floor((rightptr+leftptr)/2);
        if(target==nums[midptr]){
           rightptr = midptr + 1;
           leftptr = midptr -1;
           while(nums[leftptr]!=target){
               leftptr-=1;
           }
           arr[0] = leftptr;

           while(nums[rightptr]!=target){
               rightptr+=1;
           }
           arr[1] = rightptr;
        }
        else if(target<nums[midptr]){
            rightptr = midptr-1;
            midptr = (int)Math.floor((rightptr+leftptr)/2);
            rightptr = midptr + 1;
            leftptr = midptr -1;
            while(nums[leftptr]!=target){
                leftptr-=1;
            } 
            arr[0] = leftptr;

            while(nums[rightptr]!=target){
                rightptr+=1;
            }
            arr[1] = rightptr;

        }
        else if(target>nums[midptr]){
            leftptr = midptr+1;
            midptr = (int)Math.floor((rightptr+leftptr)/2);
            rightptr = midptr + 1;
            leftptr = midptr -1;
            while(nums[leftptr]!=target){
               leftptr-=1;
            }
            arr[0] = leftptr;

            while(nums[rightptr]!=target){
                rightptr+=1;
            }
            arr[1] = rightptr;

        }
        else{
            arr[0] = -1;
            arr[1] = -1;
        }

        return arr;
        
    }
}

