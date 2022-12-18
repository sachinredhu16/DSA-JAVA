package Recursion1;

public class LastIndexOfNumber {
    public static int findIndex(int[] arr , int start,int num){
        if (start>=0 && arr[start]==num ){
            return start;
        }
        if(start<0)
            return -1;
        return findIndex(arr,start-1,num);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,7};

        System.out.println(findIndex(arr,arr.length-1,3));
    }
}
