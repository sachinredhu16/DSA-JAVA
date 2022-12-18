package string;

import java.util.HashSet;

public class SubString {
    public static void main(String[] args) {
        String str = "sangeet";

        HashSet<String> set = new HashSet<>();

        set.add(String.valueOf(str.charAt(str.length()-1)));

        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                set.add(str.substring(i,j));
            }
        }
        System.out.println(set);

    }
}
