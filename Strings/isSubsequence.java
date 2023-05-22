package Strings;

public class isSubsequence {
    public boolean isSubsequence1(String s, String t) {
        int l=0, r=0;

        if(s.length()<1){
            return true;
        }

        while(r<t.length()){
            if(s.charAt(l)==t.charAt(r)){
                l++;
            }
            r++;
            if(l==s.length()){
                return true;
            }

        }
        
        return false;

       
    }
    
}
