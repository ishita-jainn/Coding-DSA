package Recursion;

public class towerOfHanoi {

    public static void TOH(int n, String src, String dest, String help){

        if(n==1){
            System.out.println("Transfer " + n + " disc from " + src + " to " + dest);
            return;
        }
        TOH(n-1, src, help, dest);
        System.out.println("Transfer " + n + " disc from " + src + " to " + dest);
        TOH(n-1, help, dest, src);
    }

    public static void main(String[] args) {
        int n =3;
        TOH(n, "S", "D", "H");
    }
    
}
