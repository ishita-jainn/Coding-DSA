package Recursion;

public class fibonacci {

    public static void fibo(int a, int b, int n){

        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibo(b,c,n-1);

        
    }

    public static void main(String[] args) {
        
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        fibo(a,b,n-2);
        System.out.println("this is the fibonacci series");
    }
    
}