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

public class mergeTwoLists {
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        if(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list1.next = mergeTwoLists1(list1.next , list2);
                return list1;
            }
            else{
                list2.next = mergeTwoLists1(list1, list2.next);
                return list2;
            }
        }
        if(list1 ==null){
            return list2;
        }
        return list1;
        
    }
    
}

