package BinarySearch.Easy;

public class GuessNumHighLow {
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */


    public int guessNumber(int n) {

        int low =0;
        int high = n;
        while(low<=high){
            int mid = low + (high-low)/2;
            int ans = 0; //guess(mid)

            if(ans==0){
                return mid;
            }

            else if(ans==1){
                low = mid+1;
            }

            else{
                high = mid-1;
            }
        }

        return -1;
        
    }
}
    

