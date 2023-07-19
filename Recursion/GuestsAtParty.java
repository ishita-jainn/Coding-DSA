package Recursion;

public class GuestsAtParty {

    public static int call(int n){
        if(n<=1){
            return 1;
        }

        int single = call(n-1);

        int pair = (n-1)* call(n-2);

        return single+pair;
        
    }

    public static void main(String[] args) {
        System.out.println(call(5));
    }
    
}
