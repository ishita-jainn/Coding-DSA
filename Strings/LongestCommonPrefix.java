package Strings;
import java.util.*;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        //Method 1 : Runtime 2ms
          Arrays.sort(strs);
          String s1 = strs[0];
          String s2 = strs[strs.length-1];
          int idx =0;
            
          while(idx<s1.length() && idx<s2.length()){
            if(s1.charAt(idx)==s2.charAt(idx)){
              idx++;
            }
            else{
                break;
            }
            
          }
        //   return s1.substring(0,idx);  

        //Method 2. Runtime 1ms
    
          String prefix = strs[0];
          for(int i=1;i<strs.length;i++){
              
              while(strs[i].indexOf(prefix)!=0){
                  prefix = prefix.substring(0, prefix.length()-1);
                  System.out.println(prefix);
              }
          }
    
          return prefix;
        }
    
}
