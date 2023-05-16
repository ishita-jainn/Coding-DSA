

public class SubarraySumDivisibleByK {
    public static int longestsub(int[] arr, int k){
        int l=0;
        int max_sum =0;
        int sum=0;
        int max_len =0;
        for(int r =0;r<arr.length;r++){
            if(((sum+arr[r])%k)==0){
                sum+=arr[r];
                max_sum = Math.max(sum,max_sum);
            }
            else{
                l++;
            }
            max_len= Math.max(max_len, r-l+1);

        }



        return max_len;
    }

    public static void main(String[] args){
        int[] arr = {2,7,6,1,4,5};
        int k = 3;
        System.out.println(longestsub(arr, k));
    }

    
}
