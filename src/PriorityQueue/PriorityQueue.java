package PriorityQueue;

public class MinHeapTree {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.insert(10);
        priorityQueue.insert(5);
        priorityQueue.insert(15);
        priorityQueue.insert(2);
        priorityQueue.insert(4);
        priorityQueue.insert(20);

        priorityQueue.printQueue();
//        priorityQueue.remove();
        priorityQueue.remove();
        priorityQueue.remove();
        priorityQueue.remove();
        priorityQueue.remove();
        priorityQueue.printQueue();

//        priorityQueue.insert(4);
//        priorityQueue.printQueue();
    }
}
