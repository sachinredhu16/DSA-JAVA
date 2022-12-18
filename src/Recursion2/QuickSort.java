package Recursion2;

public class QuickSort {



    public static void quickSort(int[] arr,int start,int end ){
        if(start>=end){
            return;
        }

        int pivot = partition(arr , start,end);
        quickSort(arr,start,pivot-1);
        quickSort(arr,pivot+1,end);
    }

    public static void main(String[] args) {
        int[] arr = {5,7,9,2,4,6,9};
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int partition(int[] arr , int start,int end){
        int countMax = 0;
        int pivot = arr[start];
        for(int i=start+1;i<=end;i++){
            if(pivot >=arr[i]){
                countMax++;
            }
        }
        int pivotIndex = start+countMax;

        if(countMax>0)
            swap(arr,start,pivotIndex);

        while (start<end ){
            while (start<=end && arr[start]<=pivot){  start++; }
            while (arr[end]>pivot){  end--;  }
            while (start<=end){
                swap(arr,start,end);
                start++;
                end--;
            }

        }
        return pivotIndex;
    }

    public static void swap(int[] arr ,int first,int sec){
        int temp= arr[sec];
        arr[sec]=arr[first];
        arr[first]= temp;
    }
}
