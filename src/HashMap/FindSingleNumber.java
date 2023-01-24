package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindSingleNumber {
    public static void main(String[] args) {
        Integer[] arr = {4,1,2,1,2};
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(list.contains(arr[i])){
                list.remove(arr[i]);
            }

            else {
                list.add(arr[i]);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        System.out.println();
    }
}
