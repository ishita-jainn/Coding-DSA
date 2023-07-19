package BackTracking;

public class OnlyOneSubseqInSumK {

    public static boolean printS(int idx, int s, int[] nums, int sum){

        if(idx==nums.length){
            if(s==sum){
                
                return true;
            }
            else return false;
        }

        s+=nums[idx];
        if(printS(idx+1, s, nums, sum)) return true;
        

        s-=nums[idx];
        if(printS(idx+1, s, nums, sum)) return true;
       
        return false;

    }

    public static void main(String[] args) {
        System.out.println(printS(0, 0, null, 0));
        
    }

    
}
