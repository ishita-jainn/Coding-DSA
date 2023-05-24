package Queue;

public class QueueUsingArrays {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear =-1;

        Queue(int n){
            arr = new int[n];
            this.size = n;

        }

        public static boolean isEmpty(){
            return rear ==-1;
        }

        public static boolean isFull(){
            return rear == size-1;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            arr[++rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<=rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;           
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];

            return front;

        }
    }

    public static void main(String args[]){

        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        

        

        System.out.println(q.remove());
        System.out.println(q.peek());
    }


}
