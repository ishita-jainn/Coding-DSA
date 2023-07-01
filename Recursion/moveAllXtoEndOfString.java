package Recursion;

public class moveAllXtoEndOfString {

    public static void move(String str , int idx, int count, String strnew){
        
        
        if(idx == str.length()){
            for(int i=0;i<count;i++){
                strnew += "x";
            }
            System.out.println(strnew);
            return;

        }

        if(str.charAt(idx)=='x'){
            count++;
            move(str, idx + 1,count, strnew);

        }
        else{
            strnew+=str.charAt(idx);
            move(str, idx + 1,count, strnew);
            
        }
        
    }

    public static void main(String[] args) {
        move("nxuxlxxl", 0,0,"");
    }


    
}
