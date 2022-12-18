package Recursion1;

public class AllIndicesOfNumber {
    public static int findIndex(int[] arr,int[] output, int start,int num,int fill){
        if (start<arr.length&& arr[start]==num ){
            output[fill]=start;
            fill++;
        }
        if(arr.length<=start)
            return fill;
        return findIndex(arr,output,start+1,num,fill);

    }
    public static int[] findIndex(int[] arr , int num){
        int[] output = new int[arr.length];
        int fill = findIndex(arr,output,0,num,0);
        int[] giv = new int[fill];
        for(int i=0;i<fill;i++){
            giv[i]=output[i];
        }
        return giv;

    }

    public static void main(String[] args) {
        int[] arr = {3,2,3,4,3,6,3};

        int [] output = findIndex(arr,3);

        System.out.println();
    }
}
