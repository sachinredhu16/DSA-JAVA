package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                set.remove(arr[i]);
            }
            else
                set.add(arr[i]);
        }
        System.out.println(set);

        // alternative approach
        int XOR =0;
        for (int i=0;i<arr.length;i++){
            XOR ^=arr[i];
        }
        System.out.println("Unique element is : "+XOR);


    }
}
