package Strings;
import java.util.*;


public class StringIntoMobileNumericKeypad {

    public static String keypad(String str){
        String number ="";
        str = str.toUpperCase();

        String keyp[] = {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                number+="0";
            }
            else{
                number+=(keyp[str.charAt(i)-'A']);
            }
        }
        return number;
        
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(keypad(input));

        in.close();
    }
    
    
}
