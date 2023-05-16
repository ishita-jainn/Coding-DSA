package Strings;

public class countSubstrings {
    public int countSubstring(String s) {
        int len1=0;
        int len2 =0;

        for(int i=0;i<s.length();i++){
            len1 += expandFromCenter(s,i,i+1);
            len2 += expandFromCenter(s,i,i);  
        }
        return len1+len2;
    } 

    public static int expandFromCenter(String s, int i, int j){
        int count =0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            count++;
            i--;
            j++;
        }
        return count;
    }
}
