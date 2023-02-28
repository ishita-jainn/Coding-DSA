
import java.util.*;


public class maxsubarray{

    //Brute Force 
    public int subarray(int[] arr){
        int maxsum =0, sum=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j= i;j<arr.length;j++){
                sum += arr[j];
                if(sum>maxsum){
                    maxsum=sum;
                }
                else{
                    continue;
                }
            }
        }

        return maxsum;
    }


    //Kadane's Algorithm

    public int Kadane(int[] arr2){
        int maxsum = Integer.MIN_VALUE;
        int currsum =0;
        for(int i=0;i<arr2.length;i++){
            if(currsum>(currsum+arr2[i])){
                break;
            }
            else{
                currsum+=arr2[i];
            }

            if(currsum>maxsum){
                maxsum =currsum;
            }
        

            
        }
        return maxsum;


    }
    
    public static void main(String args[]){
        maxsubarray obj = new maxsubarray();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];        
        for(int i=0;i<n;i++){
            arr1[i] = in.nextInt();

        }
    
        // int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(obj.Kadane(arr1));
    }
}
