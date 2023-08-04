package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationsInArray {
    public void printperm(int[] nums,List<List<Integer>> li, List<Integer> list){
        if(list.size()==nums.length){
            li.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            printperm(nums,li,list);
            list.remove(list.size()-1);

        }
        
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        printperm(nums,li,new ArrayList<>())   ;
        return li;    

    }
    
}
