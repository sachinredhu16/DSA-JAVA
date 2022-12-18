package Array;

public class ArrayEquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1,4 ,9, 3, 2};
        int rightSum =0;
        int index=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            rightSum +=arr[i];
        }
        int leftSum=0;
        for(int i=0;i<arr.length;i++){
            rightSum -=arr[i];
            if(leftSum==rightSum){
                index=i;
                break;
            }

            leftSum +=arr[i];
        }
        System.out.println("Index is : "+index);


    }
}
