package Recursion;



public class printNumbers {

    // print numbers from 5 to 1
    public static void printNumb(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumb(n-1);
    }

    //print numbers from 1 to 5
    public static void printNumbs(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumbs(n+1);

    }

    public static void main(String[] args) {
        int n =1;
        printNumbs(n);
    } 
    
}
