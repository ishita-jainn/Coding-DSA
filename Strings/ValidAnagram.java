package Strings;
import java.util.*;

public class ValidAnagram {

    class Solution {
        public boolean isAnagram(String s, String t) {

            //MY APPROACH 1 : (frequent characters test case didn't pass. ex : s-aacc , t - acaaa)
          /*  int k =-1;
            if((t.length()<s.length())|| (t.length()>s.length())){
                return false;
            }
            else{
                for(int i=0;i<t.length();i++){
                    k = s.indexOf(t.charAt(i));
                    if(k==-1){
                        return false;
                    }  
                }
            }
            return true;
            */ 

            // One stupid test case is not passing dont know why

            if((t.length()<s.length())|| (t.length()>s.length())){
                return false;
            }
    
            else{
    
                HashMap<Character, Integer> map = new HashMap<>();
    
                for(int i =0;i<t.length();i++){
                    if(map.containsKey(t.charAt(i))){
                        int val = map.get(t.charAt(i));
                        map.put(t.charAt(i) ,++val);
                    }
                    else{
                        map.put(t.charAt(i) ,1);
                    }
                }
                HashMap<Character, Integer> map2 = new HashMap<>();
                for(int i =0;i<s.length();i++){
                    if(map2.containsKey(s.charAt(i))){
                        int val = map2.get(s.charAt(i));
                        map2.put(s.charAt(i) ,++val );
                    }
                    else{
                        map2.put(s.charAt(i) ,1);
                    }
                }
    
                // int flag =0;
                Set<Character> keys = map.keySet();
                // Set<Character> keys2 = map2.keySet();
                // System.out.println(keys);
                for(Character key : keys){
                    System.out.println(key + " " + map.get(key) + " " + map2.get(key));
                }
    
                for(Character key : keys){
                    // System.out.println(key +" "+ map2.get(key));
                    // System.out.println(key+" "+ map.get(key));
                    if(map.get(key) != map2.get(key)){
    
                        // System.out.println(key +" "+ map2.get(key));
                        // System.out.println(key+" "+ map.get(key));
                        return false;
                    }
                    
                }
            }
            // return true; (ONLY to remove error for next snippet)

            // BEST APPROACH FROM SOLUTIONS. BEATS 99.69%

            
            int[] count = new int[26];
            for (char c : s.toCharArray()) count[c - 'a']++;
            for (char c : t.toCharArray()) count[c - 'a']--;
            for (int i : count) if (i != 0) return false;
            return true;
            
            
            
            
        }
    }
    
}
