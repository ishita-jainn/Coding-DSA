package Error_Handling;
import java.util.*;
import java.io.*;
import java.util.regex.*;

public class signed_int {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            int x = in.nextInt();
            int y = in.nextInt();
            System.out.println(x/y);
        }

        catch(InputMismatchException e){
            System.out.println(e.getClass().toString().replaceFirst("class"," "));
        }

        catch(ArithmeticException e){
            System.out.println(e);
        }

        in.close();

    }

}
