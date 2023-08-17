package LinkedList.Medium;
import java.util.*;

public class LRUCache {

    class Node{
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    int cap;
    HashMap<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev= head;        
    }

    private void addNode(Node newNode){
        Node temp = head.next;

        newNode.next = temp;
        newNode.prev =head;

        head.next = newNode;
        temp.prev = newNode;
    }

    private void deleteNode(Node del){
        Node prevv = del.prev;
        Node nextt = del.next;

        prevv.next = nextt;
        nextt.prev = prevv;
    }

    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }

        Node res = map.get(key);
        deleteNode(res);
        addNode(res);

        map.put(key, head.next);
        return head.next.val;
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node c = map.get(key);
            deleteNode(c);
            c.val = value;
            addNode(c);
            map.put(key,head.next);
        }
        else{
            if(map.size()==cap){
                Node prev = tail.prev;
                deleteNode(prev);
                Node l = new Node(key,value);
                addNode(l);
                map.remove(prev.key);
                map.put(key,head.next);
            }
            else{
                Node l = new Node(key,value);
                addNode(l);
                map.put(key,head.next);
            }
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
