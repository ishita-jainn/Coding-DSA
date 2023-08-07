package LinkedList.Easy;


class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


public class MiddleOfLL {
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int index1 =1;

        if(head==null||head.next==null){
            return head;
        }
        
        while(curr.next!=null){
            curr = curr.next;
            index1++;
        }

        index1 = (index1/2)+1;      

        ListNode curr1 = new ListNode();
        curr1.next =head;

        while(index1!=0){
            index1--;
            curr1 = curr1.next;
            
        }
        
        return curr1;
        
    }
    
}
