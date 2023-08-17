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
public class SortList {

    ListNode merge(ListNode right, ListNode left){

        if(right==null){
            return left;
        }
        if(left ==null){
            return right;
        }

        ListNode temp = new ListNode(-1);
        ListNode curr = temp;

        while(right!=null && left!=null){
            if(right.val<left.val){
                curr.next = right;
                curr = curr.next;
                right = right.next;
            }
            else{
                curr.next =left;
                curr = curr.next;
                left = left.next;
            }
        }

        while(right!=null){
            curr.next = right;
            curr = curr.next;
            right = right.next;

        }
        while(left!=null){
            curr.next = left;
            curr = curr.next;
            left = left.next;

        }
        return temp.next;

    }

    ListNode findMid(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode prev =null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prev;
    }
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }

        ListNode mid = findMid(head);

        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        left = sortList(left);
        right = sortList(right);

        ListNode result = merge(left,right);

        return result;
        
    }
}