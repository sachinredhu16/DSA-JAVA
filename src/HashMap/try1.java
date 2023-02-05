package HashMap;

import java.util.HashMap;
import java.util.Map;

public class try1 {
    public static void main(String[] args) {
        String ransomNote = "aa";
        HashMap<Character,Integer> table1 = new HashMap<>();

        String magazine = "aab";
        HashMap<Character,Integer> table2 = new HashMap<>();

        for(int i=0;i<ransomNote.length();i++){
            char temp = ransomNote.charAt(i);
            if(table1.containsKey(temp)){
                table1.put(temp,table1.get(temp)+1);
            }
            else {
                table1.put(temp,1);
            }
        }
        for(int i=0;i<magazine.length();i++){
            char temp = magazine.charAt(i);
            if(table2.containsKey(temp)){
                table2.put(temp,table2.get(temp)+1);
            }
            else {
                table2.put(temp,1);
            }
        }

        for(Map.Entry<Character,Integer> x : table1.entrySet()){
            if(!table2.containsKey(x.getKey())){
//                return false;
                System.out.println(false);
            }
            else {
                if(table1.get(x.getKey())!=table2.get(x.getKey()))
                    System.out.println(false);
            }
        }


    }
}
