package Recursion;
import java.util.*;

public class printSubset {

    public static void sub(int n, ArrayList<Integer> subset){
        if(n==0){
            System.out.println(subset);
            return;
        }

        //element wants to get added
        subset.add(n);
        sub(n-1,subset);


        //element wants to get removed
        subset.remove(subset.size()-1);
        sub(n-1,subset);

    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        sub(5, al);
    }
    
}
