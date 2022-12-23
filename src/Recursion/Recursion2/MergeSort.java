package Recursion.Recursion2;

public class MergeSort {
    // based on Divide and Conqueror Method

    // MergeSort algorithm takes three steps:
    // Divide step computes mid position of sub-array and it takes constant time O(1).
    // Conquer step recursively sort two sub arrays of approx n/2 elements each.
    // Combine step merges a total of n elements at each pass requiring at most n comparisons
    // so it take O(n)


    public static void merge(int [] arr , int start, int end ){
        int mid = (start+end)/2;

        int[] res = new int[end-start+1];
        int i= start;
        int j =mid+1;
        int k=0;

        while (i<=mid && j <=end){
            if(arr[i]>arr[j]){
                res[k] = arr[j];
                j++;
                k++;
            }
            else{
                res[k]= arr[i];
                i++;
                k++;
            }
        }
        while(i<=mid){
            res[k] = arr[i];i++;k++;
        }
        while(j<=end){
            res[k] = arr[j];j++;k++;
        }
        for(int l=0;l<res.length;l++){
            arr[start+l] = res[l];
        }
    }

    public static void mergeSort(int[] arr , int start,int end){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);

        merge(arr, start,end);
    }

    public static void main(String[] args) {
        int[] arr = {5,7,9,2,4,6,9};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
