package string;

import java.util.HashMap;

public class HighestOccuringCharacter {
    public static void main(String[] args) {

        String str = "abdefgbabfba";
        char c = 0;
        int max =0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
                if(max<map.get(str.charAt(i))){
                    c = str.charAt(i);
                    max = map.get(str.charAt(i));
                }
            }
            else {
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);
        System.out.println(c);
    }
}
