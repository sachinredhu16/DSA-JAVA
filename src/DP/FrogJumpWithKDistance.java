package DP;

import java.util.Arrays;

public class FrogJumpWithKDistance {
    // using Recursion
    public static int countJumpWithK1(int n , int k , int[] arr){
        if(n==0)
            return 0;
        int minSteps = Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            int temp = Integer.MAX_VALUE;
            if(n-i>=0)
                temp = countJumpWithK1(n-i,k,arr)+Math.abs(arr[n]-arr[n-i]);
            minSteps = Math.min(minSteps,temp);
        }
        return minSteps;
    }
    // using Memoization
    public static int countJumpWithK2(int k,int[] arr){
        int n = arr.length-1;
        int[] dp = new int[n+1];
        dp[0] =0;
        for(int i=1;i<=n;i++){
            int minSteps = Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                int temp = Integer.MAX_VALUE;
                if(i-j>=0)
                    temp= dp[i-j]+Math.abs(arr[i]-arr[i-j]);
                minSteps = Math.min(minSteps,temp);
            }
            dp[i] = minSteps;
        }
        return dp[n];
    }
    // using tabulation
    public static int countJumpWithK3(int k,int[] arr){
        int n = arr.length-1;
        int[] dp = new int[k];
        dp[0] =0;
        for(int i=1;i<=n;i++){
            int minSteps = Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                int temp = Integer.MAX_VALUE;
                if(i-j>=0)
                    temp= dp[j]+Math.abs(arr[i]-arr[i-j]);
                minSteps = Math.min(minSteps,temp);
            }
            for (int j=k-1;j>0;j--)
                dp[j-1] = dp[j];
            dp[k-1] = minSteps;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50};
        System.out.println("Using Recursion : "+countJumpWithK1(5,5,arr));
        System.out.println("Using Memoization : "+countJumpWithK2(5,arr));
        System.out.println("Using Tabulation : "+countJumpWithK2(5,arr));
    }
}
