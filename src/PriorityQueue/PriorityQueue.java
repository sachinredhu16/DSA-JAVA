package PriorityQueue;

public class PriorityQueue {
    public static void main(String[] args) {
        MinHeapTree minHeapTree = new MinHeapTree();
        int[] arr = {10,5,15,2,4,20};

        for(int i=0;i< arr.length;i++){
            minHeapTree.insert(arr[i]);
        }

        minHeapTree.printQueue();
//        priorityQueue.remove();
//        minHeapTree.remove();
//        minHeapTree.remove();
//        minHeapTree.remove();
//        minHeapTree.remove();
//        minHeapTree.printQueue();

//        priorityQueue.insert(4);
//        priorityQueue.printQueue();
    }
}
