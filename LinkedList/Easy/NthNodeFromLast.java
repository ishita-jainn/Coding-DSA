package LinkedList.Easy;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class NthNodeFromLast {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        if(head.next==null){
            return null;
        }
        
        ListNode iter = head;
        while(iter!=null){            
            iter = iter.next;
            size++;            
        }

        if(n==size){
            return head.next;
        }
        ListNode iter2 = head;
        for(int i=1;i<size-n;i++){
            iter2 = iter2.next;           
        }
        iter2.next = iter2.next.next;

        return head;
        
    }
}
