package HashMap;

import java.util.HashSet;

public class try1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Integer n = 10;
        set.add(n);
        Integer m = 10;
        if(set.contains(m)){
            System.out.println("contains");
        }
        else
            System.out.println("Not contains");
    }
}
