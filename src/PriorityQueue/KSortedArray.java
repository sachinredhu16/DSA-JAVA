package PriorityQueue;

import java.util.PriorityQueue;

public class KSortedArray {
    // Below solution has O(n logk) time complexity
    public static void main(String[] args) {
        int[] arr = {2,4,1,9,6,8};
        int k=3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        for(;i<k;i++){
            pq.add(arr[i]);
        }
        for(;i<arr.length;i++){
            arr[i-k]= pq.remove();
            pq.add(arr[i]);
        }
        int j = arr.length-k;
        while(!pq.isEmpty()){
            arr[j++] = pq.poll();
        }

        for(int x:arr)
            System.out.print(x+" ");
    }
}
