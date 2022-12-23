package LinearDataStructure.Queue;


public class LinearQueueArray {
    static int front ;
    static int rear ;
    static int size ;
    static int[] queue = new int[5];

    static public void printQueue(){
        for(int i=front;i<rear;i++){
            System.out.print(queue[i]+" ");
        }
    }

    public static void enqueue(int element){
        if(rear==queue.length){
            System.out.println("LinearDataStructure.Queue is full .Element is not inserted : "+element);
            return;
        }

        queue[rear] = element;
        size++;
        rear++;
    }
    public static void dequeue(){
        if(front==rear){
            System.out.println("LinearDataStructure.Queue is empty");
            return;
        }
        size--;
        front++;

    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(40);
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        enqueue(80);
        enqueue(90);


        printQueue();
    }
}

