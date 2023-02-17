package PriorityQueue;

import java.util.PriorityQueue;

public class KLargestElements {
    public static void main(String[] args) {
        int[] arr = {2,15,8,9,12,13,20};
        int k =3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            int num = pq.peek();
            if(num <arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        for(int x :pq)
            System.out.print(x+" ");
    }
}
