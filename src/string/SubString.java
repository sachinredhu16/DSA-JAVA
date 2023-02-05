package string;

import java.util.HashSet;

public class SubString {

    // O(n^2)
    public static void printAllSubstring(String s){
        int n = s.length();
        for(int i = 0; i < n; i++)
        {
            String temp="";

            for(int j = i; j < n; j++)
            {
                temp +=s.charAt(j);
                System.out.println(temp);
            }

        }
    }
    public static void main(String[] args) {
        String str = "Sangeet";
        printAllSubstring(str);

//        HashSet<String> set = new HashSet<>();
//
//        set.add(String.valueOf(str.charAt(str.length()-1)));
//
//        for(int i=0;i<str.length();i++){
//            for(int j=i;j<str.length();j++){
//                set.add(str.substring(i,j));
//            }
//        }
//        System.out.println(set);


    }
}
