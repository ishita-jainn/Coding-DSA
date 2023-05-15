package Strings;
import java.util.*;

public class LongestSubstringWithoutRepeatingChar {

    //Approach 1 : I tried, does not work since it only checks from start.
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[26];

        s = s.toLowerCase();
        String subs = "";
        Arrays.fill(arr,0);
        for(int i=0;i<s.length();i++){            
        
            ++arr[s.charAt(i)-'a'] ;
            int x = arr[s.charAt(i)-'a'];
            if(x<2){
                subs+=s.charAt(i);
            }
            else{
                break;     
                
            }         

        }  
        return subs.length();
        
    }

    // Approach 2 : Correct one. Use of sliding window.

    public int lengthOfLongestSubstring2(String s) {
        HashSet<Character> set = new HashSet<>();
        int r =0,l=0;
        int max =0;

        while(r<s.length()){
            Character c = s.charAt(r);
            if(set.add(c)){
                max = Math.max(max,(r-l+1));
                r++;
            }
            else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }
    
}
