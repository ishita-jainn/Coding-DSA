package Sliding_Window.Hard;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length()==0 || s.length()<t.length()){
            return "";
        }


        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i))+1);
            }
            else{
                map.put(t.charAt(i),1);
            }
        }

        int count =0;
        int minleft =0;
        int minlen =Integer.MAX_VALUE;
        int l =0;

        for(int r=0;r<s.length();r++){
            if(map.containsKey(s.charAt(r))){
                map.put(s.charAt(r), map.get(s.charAt(r))-1);
                if(map.get(s.charAt(r))>=0){
                    count++;
                }
            }
                
            

            while(count ==t.length()){

                if(minlen>r-l+1){
                    minlen = r-l+1;
                    minleft = l;
                }
                if(map.containsKey(s.charAt(l))){
                    map.put(s.charAt(l), map.get(s.charAt(l))+1);
                    if(map.get(s.charAt(l))>0){
                        count--;
                    }
                }
                l++;
            }
            
        }

        if(minlen>s.length()){
            return "";
        }
        return s.substring(minleft,minleft+minlen);       
        
    }
    
}
