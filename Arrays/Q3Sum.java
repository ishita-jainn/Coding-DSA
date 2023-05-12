import java.util.*;


public class Q3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            int j=i+1;
            int k= nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    li.add(nums[i]);
                    li.add(nums[j++]);
                    li.add(nums[k--]);
                    
                    set.add(new ArrayList<Integer>(li));
                    
                }
                li.clear();
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
            }
        } 
        return new ArrayList<>(set);
    }
}
