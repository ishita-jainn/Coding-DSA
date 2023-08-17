package LinkedList.Medium;

public class DeleteMiddle {
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = new ListNode(0,slow);

        if(head==null||head.next==null){
            return null;
        }

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            prev = prev.next;
            
        }
        prev.next = slow.next;
        slow.next =null;
        return head;

        
    }
    
}
