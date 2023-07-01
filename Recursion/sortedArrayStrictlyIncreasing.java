package Recursion;

public class sortedArrayStrictlyIncreasing {

    public static boolean sorted(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }
        
        
        if(arr[idx]<arr[idx+1]){
            return sorted(arr,idx+1);
        }
        else{
            return false;
        }

        //reverse condition:
        /*if(arr[idx]>=arr[idx+1]){
            return false;
        }
        else{
            return sorted(arr,idx+1);
        }            
        
        */

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5};
        System.out.println(sorted(arr,0));
    }
    
}
