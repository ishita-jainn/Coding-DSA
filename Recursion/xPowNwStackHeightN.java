package Recursion;

public class xPowNwStackHeightN {

    public static int printxn(int x, int n, int ht){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        
        System.out.print(ht++);
        int xcurr = x*printxn(x,n-1,ht);
        return xcurr;


    }
    public static void main(String[] args) {
        System.out.println(printxn(2,5,0));
    }
    
}
