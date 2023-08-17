package LinkedList.Medium;

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
public class RotateLisr {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        
        ListNode curr = head;
        int n=0;
        while(curr!=null){
            curr = curr.next;
            n++;
        }
        curr = head;
        
        k = k%n;
        if(k==0){
            return head;
        }
        int i= 0;
        while(i<(n-k-1)){
            curr = curr.next;
            i++;
        }
        
        
        ListNode newhead = curr.next;
        curr.next = null;

        ListNode curr2 = newhead;
        
        while(curr2!= null && curr2.next!=null){
            curr2= curr2.next;
        }
        curr2.next = head;
        return newhead;                         
        
    }
}
