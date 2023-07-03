package Recursion;

public class allPermutationsOftring {
    public static void printperm(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i=0;i<str.length();i++){
            
            Character ch = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);
            printperm(newString, permutation + ch);
        }
    }

    public static void main(String[] args) {
        printperm("abc", "");
    }
    
}
