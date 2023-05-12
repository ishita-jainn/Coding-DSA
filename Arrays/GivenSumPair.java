import java.util.*;

public class GivenSumPair {
    public static void main(String[] args){
        // int[] num = new int[6];
        int[] num = {1,4,45,6,10,8};
        int sum =16;

        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<6;i++){
            int target = sum -num[i];
            if(set.contains(target)){
                System.out.println("yes");
                System.out.println(num[i] + " "+ target);
                return;
            }
            set.add(num[i]);
        }
        System.out.println("no");

    
    }
    
}
