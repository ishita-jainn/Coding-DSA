package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationWithWindowK {

    public void pairing(int n, int k, List<List<Integer>> list, ArrayList<Integer> li, int idx){
        if(idx==n+1){
            if(li.size()==k){
                list.add(new ArrayList<>(li));                
            }
            return;
            
        }

        li.add(idx);
        pairing(n, k,list,li,idx+1);
        li.remove(li.size()-1);
        pairing(n,k,list,li,idx+1);           
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        ArrayList<Integer> li = new ArrayList<>();
        pairing(n,k,list,li, 1);
        return list;
    }
    
}
