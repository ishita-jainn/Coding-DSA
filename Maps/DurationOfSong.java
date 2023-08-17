package Maps;

import java.util.HashMap;

public class DurationOfSong {
    public int numPairsDivisibleBy60(int[] time) {
        int count =0;
        HashMap<Integer, Integer> table = new HashMap<>();
    
        for(int i=0;i<time.length;i++){
            int rem = time[i]%60;
            

            if(rem==0 && table.containsKey(rem)){
                count+= table.get(rem);
            }


            else if(table.containsKey(60-rem)){
                count += table.get(60-rem);
                
            }
            

            if(table.containsKey(rem)){
                table.put(rem, table.get(rem)+1);
            }

            else{
                table.put(rem, 1);
            } 


        }      
        return count;   
        
    }
    
}
