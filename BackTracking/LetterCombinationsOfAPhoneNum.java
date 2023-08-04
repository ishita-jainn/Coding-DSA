package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNum {
    public void backtrack(StringBuilder sb, String digits, int idx,String[] mapping ,List<String> result){

        if(idx==digits.length()){
            result.add(sb.toString());
            return;
        }

        String seq = mapping[digits.charAt(idx)-'0'];
        for(int i=0;i<seq.length();i++){
            sb.append(seq.charAt(i));
            backtrack(sb,digits,idx+1,mapping,result);
            sb.deleteCharAt(sb.length()-1);
        }
        
    }


    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();  
        String[] keypad = {""," ", "abc", "def", "ghi","jkl","mno","pqrs" ,"tuv","wxyz"};
        if(digits.length()==0){
            return list;
        }
        backtrack(new StringBuilder(),digits,0,keypad,list);
        return list;    
        
    }    
    
}
