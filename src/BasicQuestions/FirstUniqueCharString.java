package BasicQuestions;

import java.util.ArrayList;
import java.util.List;

public class FirstUniqueCharString {
    public static void main(String[] args) {
        String s ="bjberiiiwjncrefhvhekh";
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(list.contains(c))
                list.remove((Character) c);
            else
                list.add(c);
        }
        System.out.println(list.get(0));
    }
}
