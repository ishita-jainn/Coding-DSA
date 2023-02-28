
import java.util.*;

public class reversearray{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i= 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("dfd");
        int x= n-1;
        for(int i=0;i<n;i++){
            // System.out.println("dfd");
            System.out.println(arr[n-1-i]);
        }        

    }
}

