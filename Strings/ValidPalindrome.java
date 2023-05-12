package Strings;
// import java.util.*;

public class ValidPalindrome {

    //This was my approach but regex takes too much time. Runtime : 28ms , beats 33% only.

    public boolean isPalindrome1(String s) {
        String news = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();  
        int j = news.length() -1;     
        for(int i=0;i<news.length()/2; i++){
            if(news.charAt(i)!=news.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }

    // This approach was found in solutions. This is without regex. Runtime : 3ms , beats 98%.
    public boolean isPalindrome2(String s) {
        int start = 0;
        int last = s.length() - 1;
        while(start < last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
    
}
