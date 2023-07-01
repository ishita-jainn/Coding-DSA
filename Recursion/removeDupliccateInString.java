package Recursion;
import java.util.*;

public class removeDupliccateInString {

    public static String rem(String str, int idx, String newstr, HashSet<Character> set){
       
        if(idx==str.length()){
            return newstr;
        }

        // int ch = str.charAt(idx) - 'a';

        if(set.add(str.charAt(idx))){
            newstr+=str.charAt(idx);
            return rem(str, idx+1, newstr,set);
            

        }
        else{
            return rem(str, idx+1, newstr,set);

        }

    }

    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        System.out.println(rem("ishitaishita", 0, "", set));
    }
    
}
