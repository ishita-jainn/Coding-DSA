import java.util.*;
public class DuplicateInArray {
    /* Using HashMap */
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> nums1 = new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(nums1.containsKey(nums[i])){
                return true;
            }
            nums1.put(nums[i],i);

        }
        return false;
    }

    /* Using HashSet */
    public boolean contdup(int[] nums){
        HashSet<Integer> h1 = new HashSet<Integer>();
        for(int num:nums){
            h1.add(num);
        }
        if(h1.size()==nums.length){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();

        }
        DuplicateInArray obj = new DuplicateInArray();
        System.out.println(obj.contdup(arr));
    }
}

