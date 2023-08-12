package LinkedList.Medium;

class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SwapNodes {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;
        for(int i=0;i<k;i++){
            first = first.next;
        }

        ListNode temp = first;
        while(temp!=null){
            temp = temp.next;
            second = second.next;
        }

        int tempVal = first.val;
        first.val = second.val;
        second.val= tempVal;        
        

        return dummy.next;
    
        
        
    }
    
}

