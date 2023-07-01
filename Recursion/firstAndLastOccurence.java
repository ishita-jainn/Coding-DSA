package Recursion;

public class firstAndLastOccurence {
    public static int first = -1;
    public static int last = -1;
    
    

    public static void occ(String a, int idx, Character aa){
    
        if(idx ==a.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if(a.charAt(idx) == aa){
            if(first==-1){
                first = idx;
            }
            else{
                last =idx;
            }
        }

        occ(a, idx+1 ,aa);
    }

    public static void main(String[] args) {
        occ("ishitaisoi" , 0 , 'i');
    }
    
}
