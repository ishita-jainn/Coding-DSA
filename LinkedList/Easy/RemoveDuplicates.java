package LinkedList.Easy;

import java.util.HashSet;

public class RemoveDuplicates {

// Unsorted
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> set = new HashSet<>();

        ListNode curr = head;
        

        if(head==null||head.next==null){
            return head;
        }
        set.add(head.val);

        while(curr.next!=null){
            if(!set.add(curr.next.val)){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }

        return head;
        
    }

//Sorted

public ListNode deleteDuplicates2(ListNode head) {

    ListNode curr = head;
    

    if(head==null||head.next==null){
        return head;
    }

    while(curr.next!=null){
        if(curr.val == curr.next.val){
            curr.next = curr.next.next;
        }
        else{
            curr = curr.next;
        }
    }

    return head;
    
}
    
}
