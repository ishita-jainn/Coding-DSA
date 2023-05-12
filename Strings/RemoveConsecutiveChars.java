package Strings;
import java.util.*;

public class RemoveConsecutiveChars {
    public String removeConsecutiveCharacter(String S){
        Stack<Character> st = new Stack<>();
        for(Character ch : S.toCharArray()){
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(st.peek() != ch){
                st.push(ch);
            }
            else{
                continue;
            }
            
        }
        Iterator<Character> itr = st.iterator();
        String str ="";
        while(itr.hasNext()){
            str+= itr.next().toString();
            
        }
        
        return str;
    }
    
}
