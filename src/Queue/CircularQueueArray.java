package Queue;


public class CircularQueueArray {
    static int front ;
    static int rear ;
    static int size ;
    static int[] queue = new int[4];


    public static void enqueue(int element){
        if(size==queue.length){
            System.out.println("Queue is full .Element is not inserted : "+element);
            return;
        }
        queue[rear]=element;
        size++;
        rear++;
        if(rear==queue.length)
            rear=0;

    }
    public static void dequeue(){
        if(size==0){
            System.out.println("Queue is empty");
            return;
        }
        size--;
        System.out.println("Element is Dequeued :- "+queue[front]);
        front++;
        if(front==queue.length)
            front=0;

    }

    static public boolean isNotEmpty(){
        return size>0;
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        dequeue();
        dequeue();

        enqueue(50);
        enqueue(60);
        enqueue(60);

        System.out.println("===================================");
        while (isNotEmpty()){
            dequeue();
        }

    }
}


