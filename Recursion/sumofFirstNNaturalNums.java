package Recursion;

public class sumofFirstNNaturalNums {
    

    public static void printsum(int n, int sum){
        
        if(n==0){
            System.out.println(sum);
            return;

        }
        sum+=n;
        printsum(n-1,sum);        
    }

    public static void main(String[] args) {
        int ans =0;
        printsum(5,ans);
    }
    
}
