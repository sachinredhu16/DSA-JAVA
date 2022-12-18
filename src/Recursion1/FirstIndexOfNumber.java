package Recursion1;

public class FirstIndexOfNumber {
    public static int findIndex(int[] arr , int start,int num){
        if (start<arr.length&& arr[start]==num ){
            return start;
        }
        if(arr.length<=start)
            return -1;
        return findIndex(arr,start+1,num);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        System.out.println(findIndex(arr,0,31));
    }
}
