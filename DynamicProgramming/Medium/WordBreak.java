package DynamicProgramming.Medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordBreak {

    // non dp sol:
    public boolean wordBreak(String s, List<String> wordDict) {

        boolean[] table = new boolean[s.length()];

        for(int i=0;i<table.length;i++){
            for(int y=0;y<=i;y++){
                if(y==0 || table[y-1]){
                    if(wordDict.contains(s.substring(y,i+1))){
                        table[i] = true;
                        break;
                    }
                }
            }
        }

        return table[table.length-1];        
    }

    //dp sol
    private Map<String, Boolean>dp;

    public boolean solve(String s, Set<String> m){
        if(s.length()==0){
            return true;
        }

        if(dp.containsKey(s))
            return dp.get(s);
        
        for(int i=0;i<s.length();i++){
            String r = s.substring(0,i+1);
            if(m.contains(r)){
                if(solve(s.substring(i+1),m)){
                    dp.put(s,true);
                    return true;
                }
            }
        }

        dp.put(s, false);
        return false;
    }

    public boolean wordBreak1(String s, List<String> wordDict) {

        Set<String> m = new HashSet<>(wordDict);
        dp = new HashMap<>();
        return solve(s,m);      
    }
    
}
