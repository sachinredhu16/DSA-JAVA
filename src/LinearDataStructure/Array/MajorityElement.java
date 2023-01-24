package LinearDataStructure.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,4,4,3,1,0,0};

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int key = map.get(nums[i]);
                map.put(nums[i],++key);
            }
            else{
                map.put(nums[i],1);
            }
        }

        int count =0;
        int elementHavingMaxCount=0;

        for(Map.Entry<Integer,Integer> x:map.entrySet()){
            int key = x.getKey();
            int value =  x.getValue();
            if(count<value){
                elementHavingMaxCount = key;
                count = value;
            }
        }
        System.out.println("Most occuring number is : "+elementHavingMaxCount);
    }
}
