package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        // This algorithm has a worst-case time complexity of O(n2).
        // The bubble sort has a space complexity of O(1).

        int[] arr = {4,2,6,9,3,1};
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
