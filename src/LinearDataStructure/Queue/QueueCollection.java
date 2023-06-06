package LinearDataStructure.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.remove();


        while (!queue.isEmpty()){
            System.out.print(queue.remove()+" ");
        }
    }
}
