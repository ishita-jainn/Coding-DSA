package Strings;
import java.util.*;

public class DuplicatesInString {
    public static void main(String[] args){
        HashMap<Character,Integer> map = new HashMap<>();

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.toLowerCase();


        for(Character ele : str.toCharArray() ){
            if(map.containsKey(ele)){
                int val = map.get(ele);
                map.put(ele,++val);
            }
            else{
                map.put(ele,1);
            }          
            
        }

        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue()>1){
                System.out.println(e.getKey() + " "+ e.getValue());
            }
        }

        in.close();

    }


    
}
