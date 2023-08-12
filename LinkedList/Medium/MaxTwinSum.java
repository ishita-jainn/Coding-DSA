package LinkedList.Medium;

import LinkedList.Medium.ReorderList.ListNode;

public class MaxTwinSum {
    public int pairSum(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next != null){
            fast= fast.next.next;
            slow= slow.next;
        }

        ListNode prev = null;
        ListNode next;
       
        while(slow!=null){
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        ListNode fcur = head;
        int sum = 0;
        while(prev!=null){
            sum = Math.max(sum, prev.val+fcur.val);
            prev = prev.next;
            fcur = fcur.next;
        }

        return sum;
        
    }
    
}
