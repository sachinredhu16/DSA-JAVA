package Recursion1;

public class checkSortedArray {
    public static boolean check(int[] arr){

        if(arr.length<=1){
            return true;
        }
        int[] smallArr = new int[arr.length-1];
        for (int i=1;i<arr.length;i++){
            smallArr[i-1]= arr[i];
        }
        boolean b = check(smallArr);
        if(!b)
            return false;
        if(arr[0]<=arr[1])
            return true;
        else
            return false;
    }

    public static boolean check(int[] arr , int first, int second){
        if(arr.length>second&& arr[first]>arr[second] )
            return false;
        if(second==arr.length)
            return true;
        return check(arr,first+1,second+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,59,6,7};
        if(check(arr,0,1)){
            System.out.println("Array Sorted !");
        }
        else{
            System.out.println("Arrays unsorted !");
        }
    }
}
