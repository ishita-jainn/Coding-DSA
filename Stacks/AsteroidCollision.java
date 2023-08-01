package Stacks;

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stk.empty()||arr[i]>0){
                stk.push(arr[i]);

            }
            else{
                while(!stk.empty() && stk.peek()>0 && stk.peek()<Math.abs(arr[i])){
                    stk.pop();
                }
                if(!stk.empty() && stk.peek()==Math.abs(arr[i])){
                    stk.pop();
                }
                else{
                    if(stk.empty()|| stk.peek()<0){
                        stk.push(arr[i]);
                    }
                }

            }
        }

        int[] ans = new int[stk.size()];
        int k = stk.size();
        while(!stk.empty()){
            ans[--k]  = stk.pop();
        }
           
        return ans;
    }
    
}
