package Recursion1;

public class SumArray {
    public static int sum(int arr[]){
        if(arr.length==1){
            return arr[0];
        }
        int[] smallArr = new int[arr.length-1];
        for (int i=1;i<arr.length;i++){
            smallArr[i-1]= arr[i];
        }
        int res = sum(smallArr);
        return arr[0]+res;
    }

    public static int sum(int[] arr, int index){
        if(index==arr.length){
            return 0;
        }
        return arr[index]+sum(arr,index+1);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Sum is : "+sum(arr));
        System.out.println("Sum is : "+sum(arr,0));
    }
}
