package Recursion;


public class KeypadCombination {
    public static String[] keypad = {".", "abc", "def", "ghi","jkl","mno","pqrs" ,"tu","vwx","yz"};
    public static void combination(String comb, int idx, String combined){

        if(idx ==comb.length()){
            System.out.println(combined);
            return;

        }

        String mapping = keypad[comb.charAt(idx) -'0'];
        for(int i=0;i<mapping.length();i++){
            combination(comb, idx+1,combined + mapping.charAt(i));
        }

    }

    public static void main(String[] args) {
        combination("23", 0, "");
    }
    
}
