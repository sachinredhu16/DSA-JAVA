package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,3,6,8,7,3,4,9,8};
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],true);
                list.add(arr[i]);
            }
        }

        for(Integer element:list){
            System.out.print(element+" ");
        }
    }
}
