package Recursion;

public class xPowNwStackHeightLogN {

    public static int printxn2(int x, int n){

        if(n==1){
            return 1;

        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            int ans = printxn2(x,n/2)*printxn2(x,n/2);
            return ans;
        }
        else{
            int ans = x*printxn2(x,n/2)*printxn2(x, n/2);
            return ans;
        }
    }

    public static void main(String[] args) {
        System.out.println(printxn2(2,5));
    }

    
}
