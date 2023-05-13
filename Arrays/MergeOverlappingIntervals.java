import java.util.*;

public class MergeOverlappingIntervals {

    public static int[][] merge1(int[][] intervals) {

        //Approach 1 : Using Stacks

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        Stack<int[]> stack = new Stack<>();
        stack.push(intervals[0]);

        for(int i=1;i<intervals.length;i++){

            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            int[] poparr = stack.pop();  

            int start1 = poparr[0];
            int end1 = poparr[1]; 

            int emax = Math.max(end1,end2);

            if(end1>=start2){
                int[] merge = new int[]{start1,emax};
                stack.push(merge); 

            }
            else{
                stack.push(poparr);
                stack.push(intervals[i]);
            }
        }
        int[][] output = new int[stack.size()][2];

        for(int i = output.length -1; i>=0;i--){
            int[] poparr = stack.pop();
            output[i][0]= poparr[0];
            output[i][1] = poparr[1];

        }
        return output;        
    }

    //Approach 2 : Using Arrays, more optimised

    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0 || intervals[0].length == 0) {
            return null;
        }
        int n = intervals.length;
        int[] start = new int[n];
        int[] end = new int[n];
        for(int i = 0; i < n; i ++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        List<int[]> res = new ArrayList<>();
        int p = 0;
        while(p < n) {
            int st = start[p];
            while(p < n - 1 && start[p + 1] <= end[p]) {
                p ++;
            }
            int ed = end[p];
            int[] node = {st, ed};
            res.add(node);
            p ++;
        }
        int[][] result = res.toArray(new int[res.size()][]);
        return result; 

    }

    //Main Function
    public static void main(String[] args){
        int[][] arr = {{1,3},{2,4},{6,8},{9,10}};   

        for(int i=0;i<merge1(arr).length;i++){
            System.out.print(merge1(arr)[i][0] + "  ") ;
            System.out.print(merge1(arr)[i][1]);
            System.out.println();

        } 

    }
    
}
