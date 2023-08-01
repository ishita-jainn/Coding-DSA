package Recursion;

public class powerOfANum {

    public double findPow(double x, int n){
        
        if(n == 0){
		    return 1.0;
	    }
        
        double h = findPow(x, n/2);
        
        if(n%2==0)
            return h*h;
        else 
            return h*h*x;
    }
    
    public double myPow(double x, int n) {
        
        if(n<0)
            return 1.0/findPow(x,n*-1);
        else
            return findPow(x,n);
            
    }
    
}
