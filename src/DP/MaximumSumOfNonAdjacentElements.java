package DP;

public class MaximumSumOfNonAdjacentElements {
    public static int countSum1(int n ,int[] arr){
        if(n==0)
            return arr[n];
        if(n<0)
            return 0;
        int pick = arr[n]+countSum1(n-2,arr);
        int notPick= 0+countSum1(n-1,arr);
        return Math.max(pick,notPick);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Using Recursion : "+countSum1(5,arr));


    }
}
