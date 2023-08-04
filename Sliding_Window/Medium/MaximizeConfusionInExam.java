package Sliding_Window.Medium;

public class MaximizeConfusionInExam {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int[] arr = new int[26];
        int l =0;
        int max_count =0;
        int max_wind =0;
        for(int r=0;r<answerKey.length();r++){
            max_count = Math.max(max_count, ++arr[answerKey.charAt(r)-'A']);             
            while(r-l-max_count+1>k){
                arr[answerKey.charAt(l)-'A']--;
                l++;              
            }
            max_wind = Math.max(max_wind, r-l+1);
        }
        return max_wind;
        
    }
    
}
