package Maps;
import java.util.*;

public class phonebook {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            int number = sc.nextInt();
            sc.nextLine();
            map.put(name, number);
        }
        while(sc.hasNext()){
            String query = sc.nextLine();
            if(map.containsKey(query)){
                System.out.println(query + "=" + map.get(query));
            }
            else{
                System.out.println("Not found");
            }
        }
        sc.close();
    }
}
