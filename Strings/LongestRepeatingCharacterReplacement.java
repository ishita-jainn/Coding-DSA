package Strings;

public class LongestRepeatingCharacterReplacement {

    //SLIDING WINDOW

    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int max_count =0;
        int l=0;
        int max_wind =0;
        for(int r=0;r<s.length();r++){
            max_count = Math.max(max_count,++arr[s.charAt(r) -'A'] );
            while(r-l - max_count+1 >k){
                arr[s.charAt(l) -'A']--;
                l++;
            }
            max_wind = Math.max(max_wind, r-l+1);
        }
        return max_wind;
    }      
}
