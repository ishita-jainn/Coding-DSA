package BackTracking;

public class PermutationsOfABC {
    public static void permute( String str, String perm, int idx){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }

        for(int i=0;i<str.length();i++){
            Character currChar = str.charAt(i);
            String newStr = str.substring(0,i)+ str.substring(i+1);
            permute(newStr,perm+currChar,idx+1);
        }
    }

    public static void main(String[] args) {
        permute("ABC","",0);
    }
    
}
