package Sliding_Window.Medium;

import java.util.HashMap;

public class PermutationInString {
        public boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();
        int count =0;
        int start =0;
        int end =0;

        for(int i=0;i<s1.length();i++){
            Character temp =s1.charAt(i);
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }
            else{
                map.put(temp,1);
                count++;
            }
        }

        int k =s1.length();
        while(end<s2.length()){
            Character chend = s2.charAt(end);
            if(map.containsKey(chend)){
                map.put(chend, map.get(chend)-1);
                if(map.get(chend)==0){
                    count--;
                }
            }

            if(end-start+1<k){
                end++;
            }
            else if(end-start+1==k){
                if(count==0){
                    return true;
                }
                char chStart = s2.charAt(start);
                if(map.containsKey(chStart)) {
                    map.put(chStart, map.get(chStart) + 1);
                    if(map.get(chStart) == 1) {
                        count++;
                    }
                }
                start++;
                end++;
            }
        }
        return false;

    }
    
}
