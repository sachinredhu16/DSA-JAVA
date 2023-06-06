package string;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String[] str = {"am","good","boy","i"};
        Arrays.sort(str,(a, b)->b.length()-a.length());
        for (String s :str)
            System.out.print(s+" ");
    }
}
