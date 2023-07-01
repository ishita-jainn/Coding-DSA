package Recursion;

public class reverseString {

    public static void rev(String a, int idx){
        if(idx==0){
            System.out.println(a.charAt(idx));
            return;
        }

        System.out.println(a.charAt(idx));
        rev(a,idx-1);

    }

    public static void main(String[] args) {
        rev("Ishita" , 5);
    }
    
}
