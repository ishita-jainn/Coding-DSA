package Strings;
import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] chararray =str.toCharArray();
            Arrays.sort(chararray);
            String s = new String(chararray);
            if(!map.containsKey(s)){
                map.put(s, new ArrayList<String>()); 
            }
            map.get(s).add(str);
        }

        return new ArrayList<>(map.values());
 
        
    }

    
}
