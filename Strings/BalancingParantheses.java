package Strings;
import java.util.*;

public class BalancingParantheses {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(Character ch : s.toCharArray()){
            if(ch == '('){
                st.push(')');
            }
            else if(ch == '['){
                st.push(']');
            }
            else if(ch == '{'){
                st.push('}');
            }
            else if((st.isEmpty())||(st.pop()!=ch)){
                return false;
            }
        }
        return st.isEmpty();
        
    }
    
}
