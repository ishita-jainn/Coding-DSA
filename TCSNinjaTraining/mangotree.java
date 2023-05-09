package TCSNinjaTraining;
import java.util.*;
public class mangotree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        int c = sc.nextInt();

        int n = sc.nextInt();

        if (r * 2 == n || r * (c - 1) == n)

            System.out.println("Yes");

        else

            System.out.println("No");

    }
      
}
