package LinkedList;


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
class Solution {
    public ListNode findmiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;

    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;               
            
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }

        ListNode middle = findmiddle(head);
        ListNode secondHalfHead = reverse(middle.next);

        ListNode firstHalfHead = head;
        while(secondHalfHead!=null){
            if(firstHalfHead.val!=secondHalfHead.val){
                return false;
            }
            secondHalfHead = secondHalfHead.next;
            firstHalfHead = firstHalfHead.next;
        }

        return true;        
    }
}
