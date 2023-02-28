package Strings;
import java.util.*;
import java.lang.*;

public class lexicographic{
    public static String getSmallestLargest( String s, int k){
        String smallest ="";
        String Largest ="";
        for(int i =0;i<s.length();i++){
            while(i==i+k){
                for(int j=1;j<k;j++){
                    if(((s.substring(i,i+1)).compareTo(s.substring(i+1,i+2))) < 0){
                        System.out.println(s.substring(i, k));
                    }
                }                
            }
        }

        return smallest + "\n" + Largest;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        getSmallestLargest(s, k);

        sc.close();
    }
    
}

