package CollectionExample;

import java.util.Iterator;
import java.util.PriorityQueue;

class Node{
    int num;
    int start;
    int end;

    public Node(int num, int start, int end) {
        this.num = num;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return  num +" " + start+" "+ end;
    }
}
public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->(b.end-a.end));
        pq.add(new Node(2,1,5));
        pq.add(new Node(3,4,3));
        pq.add(new Node(3,4,10));
        pq.add(new Node(3,4,1));

        Iterator<Node> iterator = pq.iterator();

        while (iterator.hasNext())
            System.out.println(pq.remove());
    }
}
