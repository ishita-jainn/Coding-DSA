package Recursion;
import java.util.*;

public class subsequences {

    public static void subs(String str, int idx, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        Character ch = str.charAt(idx);

        subs(str, idx+1, newStr + ch);
        subs(str, idx+1, newStr);
    }

    //for unique subsequeces
    public static void subs1(String str, int idx, String newStr, HashSet<String> set){
        if(idx==str.length()){
            if(set.add(newStr)) {
                System.out.println(newStr);
                return;
            }
            else{
                return;
            }
        }

        Character ch = str.charAt(idx);

        subs1(str, idx+1, newStr + ch,set);
        subs1(str, idx+1, newStr,set);

    }

    public static void main(String[] args) {
        subs("abc", 0, "");
        HashSet<String> set = new HashSet<>();
        subs1("aaa", 0, "", set);
    }
    
}
