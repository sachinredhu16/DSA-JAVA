package Recursion1;

public class CheckNumberPresent {
    public static boolean check(int arr[],int index,int num){
        if(arr.length>index && arr[index]==num)
            return true;
        if(arr.length==index)
            return false;

        return check(arr,index+1,num);
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println(check(arr,0,4));
    }
}
