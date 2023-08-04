package Sliding_Window.Hard;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int r =0;
        int[] arr = new int[n-k+1];
        int ri =0;

        Deque<Integer> q = new ArrayDeque<>();

        for(int i=0;i<n;i++){

            if(!q.isEmpty() && q.peek()== i-k){
                q.poll();
            }

            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i]){
                q.pollLast();
            }

            q.offer(i);

            if(i>=k-1){
                arr[ri++] = nums[q.peek()];
            }
        }

        return arr;
    }
    
}
