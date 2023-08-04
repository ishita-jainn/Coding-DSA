package Sliding_Window.Medium;

public class MaxNoOfVowelsInSubstring {
    public int maxVowels(String s, int k) {
        byte[] vowels = new byte[256];
        vowels['a'] = vowels['e'] = vowels['i'] = vowels['o'] = vowels['u'] = 1;
        int count =0;        
        int l=0,r=0;
        int max_count =0;

         while(r<s.length()){
            if(r-l<k){
                if(vowels[s.charAt(r)]==1){
                    count++;
                }
                r++;
            }
            else{
                max_count = Math.max(max_count, count);
                if(vowels[s.charAt(l)]==1){
                    count--;
                }
                l++;
            }
        }
        return Math.max(max_count, count);
    }
    
}
