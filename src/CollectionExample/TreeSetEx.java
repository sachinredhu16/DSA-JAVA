package CollectionExample;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(100);
        hashSet.add(200);
        hashSet.add(300);
        hashSet.add(400);

        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
//        set.add(10);
//        set.add(20);
//        set.add(30);
//        set.add(40);

        System.out.println("Greater than or equal : "+treeSet.ceiling(150));

        treeSet.stream().forEach(s-> System.out.print(s+" "));
    }
}
