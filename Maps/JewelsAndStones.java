package Maps;

import java.util.HashMap;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count =0;

        for(int i=0; i<jewels.length(); i++){
            Character temp = jewels.charAt(i);
            if(map.containsKey(temp)){
                map.put(temp, map.get(temp)+1);
            }
            else{
                map.put(temp,1);
            }

        }

        for(int i=0;i<stones.length();i++){
            Character temp = stones.charAt(i);
            if(map.containsKey(temp)){
                count++;
            }
        }
        return count;
       
        
    }
    
}
