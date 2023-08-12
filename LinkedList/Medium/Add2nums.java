package LinkedList.Medium;

public class Add2nums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //no need of length

        ListNode newNode = new ListNode();
        ListNode curr = newNode;
        int carr =0;

        while(l1!=null || l2!=null){
            int sum =carr;
            if(l1!=null){
                sum+=l1.val;
                l1 =l1.next;

            }

            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }
       
            carr = sum/10;
            curr.next = new ListNode(sum%10);
            curr= curr.next;
                     
        }

        if(carr!=0){
            curr.next = new ListNode(carr);
        }

        return newNode.next;
    }
    
}
