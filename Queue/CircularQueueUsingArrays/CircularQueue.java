package Queue.CircularQueueUsingArrays;

public class CircularQueue {

    static class Queue{
        static int front =-1;
        static int rear = -1;
        static int size;
        static int arr[];

        Queue(int n){
            this.size =n;
            arr = new int[n];
            
        }

        public static boolean isEmpty(){
            return rear ==-1 && front ==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return ;
            }
            if(front==-1){
                front =0;
            }

            rear = (rear +1)%size;
            arr[rear] = data;
            
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int res = arr[front];
            if(front==rear){
                front = rear = -1;
            }
            else{
                front = (front+1)%size;
            }
            return res;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                return arr[front];
            }

        }


    }

    public static void main(String args[]){
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            // System.out.println(q.peek());
            System.out.println(q.remove());

        }
        
       
    }
    
}
