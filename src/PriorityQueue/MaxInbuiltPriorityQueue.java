package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

// we have to return the result and then compare it to 0;
class MaxHeapComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1<o2)
            return 1;
        else if (o1>o2)
            return -1;
        return 0;
    }
}

public class MaxInbuiltPriorityQueue {
    public static void main(String[] args) {
        MaxHeapComparator maxHeapComparator = new MaxHeapComparator();
        PriorityQueue<Integer> pq = new PriorityQueue<>(maxHeapComparator);
        int[] arr = {10,5,15,2,4,20};
        for(int x :arr)
            pq.add(x);
        for (Integer x :pq)
            System.out.print(x+" ");

    }
}
