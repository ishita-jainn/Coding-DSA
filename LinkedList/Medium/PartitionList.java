package LinkedList.Medium;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        // ListNode curr1 = new ListNode(-1);
        if(head==null||head.next==null){
            return head;
        }

        ListNode small = new ListNode(-1);
        ListNode big = new ListNode(-1);
        ListNode small1 = small;
        ListNode big1 = big;
        
        ListNode curr = head;

        while(curr!=null){
            if(curr.val<x){
                small1.next = curr;
                small1 = small1.next;
            }
            else{
                big1.next = curr;
                big1 = big1.next;
            }
            curr = curr.next;
        }

        big1.next = null;
        small1.next = big.next;

        return small.next;
        
    }
    
}
