import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
     public static void main(String [] argh)
    {
        HashSet<Integer> set = new HashSet<>();

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(10,10);
        map.put(20,10);
        map.put(30,10);
        map.put(40,10);
        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next()+" ");

    }
}