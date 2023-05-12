package TCSNinjaTraining;
import java.util.*;


public class test {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int count = 0;
        while(n!=0){
            n = n/10;
            ++count;
        }
        for(int i = m; i<n+1; i++){
            String fst = String.format("%07d", i);
            System.out.print(fst + " ");




        }

        in.close(); 
    }
    
}
