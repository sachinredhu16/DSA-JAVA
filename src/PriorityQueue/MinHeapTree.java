package PriorityQueue;

import java.util.ArrayList;

public class MinHeapTree {
    private ArrayList<Integer> heap;

    MinHeapTree() {
        heap = new ArrayList<>();
    }

    public boolean isEmpty() {
        return heap.size() == 0;
    }

    public int getMin() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is Empty !");
        return heap.get(0);
    }

    public void insert(int element) {
        heap.add(element);
        int child = heap.size() - 1;
        int parent = (child - 1) / 2;
        while (child > 0) {
            if (heap.get(parent) > heap.get(child)) {
                int temp = heap.get(parent);
                heap.set(parent, heap.get(child));
                heap.set(child, temp);
                child = parent;
                parent = (child - 1) / 2;
                ;
            } else
                break;

        }
        System.out.println("Element " + element + " is inserted !");
    }

    public void remove() {
        int rem = heap.remove(0);
        heap.add(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int parent = 0;
        int min = parent;
        int left = (parent * 2) + 1;
        int right = (parent * 2) + 2;


        while (left < heap.size()) {

            if (heap.get(left) < heap.get(min))
                min = left;
            if(right < heap.size() && heap.get(right) < heap.get(min))
                min = right;

            if (heap.get(min) < heap.get(parent)) {
                int temp = heap.get(parent);
                heap.set(parent, heap.get(min));
                heap.set(min, temp);
                parent = min;
                left = (parent * 2) + 1;
                right = (parent * 2) + 2;
            } else
                return;
        }
        System.out.println("Element " + rem + " is removed !");
    }

    public void printQueue() {
        for (int x : heap) {
            System.out.print(x + " ");
        }
        System.out.println();
    }


}
