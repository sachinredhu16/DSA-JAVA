package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

class SortCharComparator implements Comparator<Character>{

    @Override
    public int compare(Character o1, Character o2) {
        if(o1<o2)
            return -1;
        else if(o1>o2)
            return 1;
        return 0;
    }
}

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        SortCharComparator sortCharComparator = new SortCharComparator();
        PriorityQueue<Character> pq = new PriorityQueue<>();
        String s = "etre";
        String res="";
        for(int i=0;i<s.length();i++)
            pq.offer(s.charAt(i));

        while(!pq.isEmpty()){
            res += pq.remove();
        }
        System.out.println(res);
    }
}
