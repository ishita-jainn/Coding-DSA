package LinkedList;

public class SLLStoreDisplay {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            // newNode.next = head;
            // head = newNode;
        }

    }

    public void displayNode(){
        Node temp = head;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public void DeleteNode(int pos){
        Node temp = head; 
        Node prev = null;
        int count = 0;   
        while(count<pos-1){
            prev = temp;
            temp = temp.next;
            count++;

        }
        prev.next = temp.next;
        temp.next= null;

    }

}
