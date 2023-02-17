package PriorityQueue;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;


class StringMinCompare implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if(o1.length()<o2.length())
            return -1;
        else if (o1.length()>o2.length())
            return 1;
        return 0;
    }
}
public class StringPriorityQueue {
    public static void main(String[] args) {
        String[] arr = {"abcde","a","ab","abcd","abc"};
        StringMinCompare stringMinCompare = new StringMinCompare();
        PriorityQueue<String> pq = new PriorityQueue<>(stringMinCompare);

        for(String x :arr)
            pq.add(x);
        while(!pq.isEmpty())
            System.out.print(pq.remove()+" ");
    }
}
