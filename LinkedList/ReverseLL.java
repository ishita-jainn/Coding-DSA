package LinkedList;

public class ReverseLL {

    Node head;
    private int size;

    ReverseLL(){
        size =0;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int data){
        
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;

        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        else{
            Node currNode = head;   
            while(currNode.next!=null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }

    public void printList(){

        if(head==null){
            System.out.println("List is empty");
        }
        Node currNode = head;   
            while(currNode!=null){
                System.out.println(currNode.data + " ");
                currNode = currNode.next;
                
            }

            System.out.println("Null");   
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        else{
            size--;
            head = head.next;
        }

    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next ==null){
            head = null;
            return;
        }
        Node secondLast = head;   
        Node Last = head.next;
        while(Last.next!=null){
            secondLast= secondLast.next;
            Last = Last.next;            
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    public void reverseIterate(){
        if(head==null || head.next ==null){
            return;
        }
        Node prev =head;
        Node curr = head.next;

        while(curr!=null){
            Node after = curr.next;
            curr.next = prev;

            prev=curr;
            curr = after;
        }

        head.next =null;
        head= prev;

    }

    public Node reverseRecursion(Node head){
        if(head ==null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursion(head.next);
        head.next.next = head;
        head.next =null;

        return newHead;
    }

    
    public static void main(String[] args){
        ReverseLL list = new ReverseLL();
        list.addFirst(1);
        list.addFirst(2);
        // list.printList();
        list.addLast(5);
        // list.printList();
        // list.deleteLast();
        // list.reverseIterate();
        list.head = list.reverseRecursion(list.head);
        list.printList();
        // list.getSize();


    } 
}
