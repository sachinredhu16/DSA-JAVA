package PriorityQueue;

public class InPlaceHeapSort {
    public static void main(String[] args) {
        int[] arr = {10,5,15,2,4,20};
        for(int i=0;i< arr.length;i++){
            insertIntoVirtuaHeap(arr,i);
        }
        for(int i=0;i<arr.length;i++){
            arr[arr.length-1-i] = removeFromVirtualHeap(arr,arr.length-i);
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int removeFromVirtualHeap(int[] arr, int heapSize) {
        int rem = arr[0];
        arr[0] = arr[heapSize-1];
        heapSize--;
        int parent =0;
        int min =parent;
        int left = (parent*2)+1;
        int right = (parent*2)+2;

        while(left<heapSize){
            if(arr[left]<arr[min])
                min = left;
            if(right<heapSize && arr[right]<arr[min])
                min = right;
            if(arr[min] <arr[parent]){
                int temp = arr[min];
                arr[min] = arr[parent];
                arr[parent] = temp;
                parent = min;
                left = (parent*2)+1;
                right = (parent*2)+2;
            }
            else
                break;
        }
        return rem;
    }

    private static void insertIntoVirtuaHeap(int[] arr, int i) {
        int child = i;
        int parent = (child-1)/2;
        while(child>0){
            if(arr[child]<arr[parent]){
                int temp = arr[child];
                arr[child] = arr[parent];
                arr[parent] = temp;
                child = parent;
                parent = (child-1)/2;
            }
            else
                return;
        }
    }
}
