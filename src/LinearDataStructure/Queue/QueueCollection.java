package LinearDataStructure.Queue;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueCollection {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedBlockingDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.remove();

        while (!queue.isEmpty()){
            System.out.print(queue.remove()+" ");
        }
    }
}
