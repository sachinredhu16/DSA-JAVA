package PriorityQueue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class MinHeapComparator implements Comparator<Integer>{
    //o1 = child o2 = parent
    @Override
    public int compare(Integer o1, Integer o2) {
//        if(o1<o2)
//            return -1;
//        else if (o1>o2)
//            return 1;
        return o1-o2;
    }
}
public class MinInbuiltPriorityQueue {
    public static void main(String[] args) {
        MinHeapComparator minHeapComparator = new MinHeapComparator();
        PriorityQueue<Integer> pq = new PriorityQueue<>(minHeapComparator);
        int[] arr = {30,20};
        for(int x :arr)
            pq.add(x);
        for (Integer x :pq)
            System.out.print(x+" ");
    }
}
