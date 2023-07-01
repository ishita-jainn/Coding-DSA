package Recursion;

public class factorialOfANumber {

    //Approach 1 : mine
    public static void facto(int n, int fact){
        if(n==1|| n==0){
            System.out.println(fact);
            return;
        }

        fact *=n;
        facto(n-1,fact);       


    }

    //Approach 2 : preferred

    public static int facto2(int n){
        if(n==1 || n==0){
            return 1;
        }

        int fac_nm1 = facto2(n-1);
        int fac_n = n*fac_nm1;
        return fac_n;
    }

    public static void main(String[] args) {
        facto(5,1);
        System.out.println(facto2(5));
        
        
    }
    
}
