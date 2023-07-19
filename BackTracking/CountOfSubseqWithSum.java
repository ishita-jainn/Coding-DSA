package BackTracking;

public class CountOfSubseqWithSum {
    public static int printG(int idx, int s, int[] nums, int sum){

        if(idx==nums.length){
            if(s==sum){
                
                return 1;
            }
            else return 0;
        }

        s+=nums[idx];
        int l = printG(idx+1, s, nums, sum);
        

        s-=nums[idx];
        int r = printG(idx+1, s, nums, sum);
       
        return l+r;

    }

    public static void main(String[] args) {
        System.out.println(printG(0, 0, null, 0));
        
    }


    
}
