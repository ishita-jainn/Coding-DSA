package LinkedList.Hard;



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeKSortedLists {

    ListNode recursiveMerge(ListNode[] lists, int lo, int hi){

        if(lists == null || lists.length == 0){
            return null;
        }

        if(hi-lo==1){
            return merge(lists[lo], lists[hi]);
        }

        if(hi==lo){
            return lists[hi];
        }

        int mid = (hi+lo)/2;
        ListNode left = recursiveMerge(lists,lo,mid);
        ListNode right = recursiveMerge(lists, mid+1, hi);

        return merge(left, right);

    }

    ListNode merge(ListNode left, ListNode right){

        if(right==null){
            return left;
        }
        if(left==null){
            return right;
        }

        ListNode curr = new ListNode(0);
        ListNode right1 = right;
        ListNode left1 = left;
        

        while(right1!=null && left1!=null){
            if(left1.val<=right1.val){
                curr.next = left1;
                left1 = left1.next;
            }
            else{
                curr.next= right1;
                right1 = right1.next;
            }
            curr = curr.next;

        }

        if(right1!=null){
            curr.next = right1;

        }
        if(left1!=null){
            curr.next = left1;
        }

        return left.val<=right.val? left : right;

    }

    public ListNode mergeKLists(ListNode[] lists) {
        return recursiveMerge(lists, 0, lists.length-1);        
    }
}
