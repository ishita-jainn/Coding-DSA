package Sliding_Window.Medium;

public class SubArrayWithAvgSizeK {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int l=0;
        int r =0;
        int sum=0;
        double avg=0;
        int count =0;

        while(r<k){
            sum+=arr[r];
            r++;
        }
        avg = sum/k;
        if(avg>=threshold){
                count++;
        }

        for(r=k;r<arr.length;r++){
            sum  -= arr[l];
            sum += arr[r];
            avg = sum/k;
            if(avg>=threshold){
                count++;
            }
            l++;
    
        }

        return count;
        
    }

    
}
