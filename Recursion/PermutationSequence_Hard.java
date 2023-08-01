package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence_Hard {

    public String getPermutation(int n, int k) {

        List<Integer> li = new ArrayList<>();

        int fact =1;

        for(int i=1;i<n;i++){
            fact = fact*i;
            li.add(i);
        }
        li.add(n);

        String ans ="";
        k = k-1;

        while(true){
            ans  = ans + li.get(k/fact);
            li.remove(k/fact);
            if(li.size()==0){
                break;
            }

            k=k%fact;
            fact = fact/li.size();
        }

        return ans;       
        
    }
    
}
