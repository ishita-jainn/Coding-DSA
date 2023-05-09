package arraylist;
import java.util.*;

public class queriesOnAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        int n = sc.nextInt();
        int l=0;
        while(l != n){
            int i = sc.nextInt();
            al.add(i);
            l++;
        }
        int q = sc.nextInt();
        for(int k =0; k<2*q;k++){
            String query = sc.nextLine();
            if(query.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                al.add(x,y);
            }
            if(query.equals("Delete")){
                int x1 = sc.nextInt();
                al.remove(x1);
            }
        }
        
        for(int item:al){
            System.out.print(item + " ");
        }
        
    }
    
}
