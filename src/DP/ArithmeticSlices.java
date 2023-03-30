package DP;

// https://leetcode.com/problems/arithmetic-slices/description/
public class ArithmeticSlices {
    static int res =0;
//  using Recursion
    public static int recursion(int n , int[] arr){
        if(n<=1)
            return 0;
        int temp1 = Math.abs(arr[n]-arr[n-1]);
        int temp2 = Math.abs(arr[n-2]-arr[n-1]);
        if(temp2==temp1){
            res++;
            System.out.print(res+" ");
            return res+recursion(n-1,arr);
        }
        return recursion(n-1,arr);
    }
    // using memoization
    public static int memoizationApp(int[] arr){
        int[] dp = new int[arr.length];
        int count =0;
        for(int i=2;i<arr.length;i++){
            int temp1 = Math.abs(arr[i]-arr[i-1]);
            int temp2 = Math.abs(arr[i-2]-arr[i-1]);
            if(temp1==temp2){
                dp[i] = dp[i-1]+1;
                count+=dp[i];
            }
        }
        return count;
    }
    // using tabulation
    public static int tabulationApp(int[] arr){
        int count =0;
        int temp =0;
        for(int i=2;i<arr.length;i++){
            int temp1 = Math.abs(arr[i]-arr[i-1]);
            int temp2 = Math.abs(arr[i-2]-arr[i-1]);
            if(temp1==temp2){
                temp++;
                count+=temp;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,10,11,12};
        System.out.println("Using Recursion : "+recursion(5,arr));
        System.out.println("Using Memoization : "+memoizationApp(arr));
        System.out.println("Using Tabulation : "+tabulationApp(arr));

    }
}
