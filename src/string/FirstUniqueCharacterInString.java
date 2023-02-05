package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String s = "loveleetcode";
        HashSet<Character> set = new HashSet<>();
        List<Character> list = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                if(list.contains(s.charAt(i))){
                    list.remove((Character) s.charAt(i));
                }
            }
            else {
                set.add(s.charAt(i));
                list.add(s.charAt(i));

            }
        }
        if(!list.isEmpty()){
            System.out.println(list.get(0));
        }
        else {
            System.out.println(-1);
        }
    }
}
