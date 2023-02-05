package HashMap;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        int ans=0;
        for(Map.Entry<Character,Integer> x:map.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
            if(x.getValue()>=2){
                System.out.println("in");
                ans += (x.getValue()/2)*2;
            }
        }

        if(ans<s.length()){
            System.out.println(++ans);
        }
        else{
            System.out.println(--ans);
        }
        System.out.println();
    }
}
