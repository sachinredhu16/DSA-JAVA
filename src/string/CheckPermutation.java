package string;

import java.util.Arrays;
import java.util.Collection;

public class CheckPermutation {
    public static void main(String[] args) {

        //Two strings are said to be a permutation of each other when either of the string's characters
        // can be rearranged so that it becomes identical to the other one.

        String s1 = "string";
        String s2 = "tsirgz";


        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean isPerm = true;
        if (arr1.length != arr2.length) {
            isPerm = false;
        } else {
            for (int i=0;i<arr2.length;i++){
                if(arr1[i]!=arr2[i]){
                    isPerm = false;
                }
            }
        }
        System.out.println(isPerm);
    }

}

