package CollectionExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class IteratorEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext())
            System.out.print(iterator.next()+" ");

        System.out.println();
        // S
        Spliterator<Integer> spl = list.stream().spliterator();
        spl.forEachRemaining(s-> System.out.print(s+" "));
    }

}
