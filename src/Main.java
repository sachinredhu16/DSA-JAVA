import java.util.*;

public class Main {
     public static void main(String [] argh)
    {
        Map<Integer,String > map = new HashMap<>();
        String s = "Abc";
        map.put(1,"Not null");
        map.put(1,null);
        map.put(null,null);

        for(Map.Entry<Integer,String> x :map.entrySet())
            System.out.println(x.getKey()+" - "+x.getValue());





    }
}