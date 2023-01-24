package HashMap;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatChar {
    public static void main(String[] args) {

        String s = "abdabcbb";

        HashMap<Character,Integer> map = new HashMap<>();
        int max =0;
        int i=-1;
        int j=-1;
        while(true){
            boolean f1 = false;
            boolean f2 = false;

            //adding
            while(i<s.length()-1){
                f1 = true;
                i++;
                char c = s.charAt(i);
                map.put(c,map.getOrDefault(c,0)+1);
                if(map.get(c)==2){
                    break;
                }
                else{
                    int len = i-j;
                    if(len>max){max = len; }
                }
            }

            // removing
            while(j<i){
                f2 = true;
                j++;
                char c = s.charAt(j);
                map.put(c,map.get(c)-1);

                if(map.get(c)==1){
                    break;
                }

            }
            if(!f1 && !f2){
                break;
            }

        }
        System.out.println(max);
    }
}
