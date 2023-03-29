package DP;

// Problem link
// https://www.codingninjas.com/codestudio/problems/frog-jump_3621012?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos

public class FrogJump {
    //using recursion
    public static int countJump(int n , int[] arr){
        if(n==0)
            return 0;
        int left =countJump(n-1,arr)+Math.abs(arr[n]-arr[n-1]);
        int right = Integer.MAX_VALUE;
        if(n>1)
            right =countJump(n-2,arr)+Math.abs(arr[n]-arr[n-2]);
        return Math.min(left,right);
    }

    // using Memoization with recursion
    public static int countJump1(int n ,int[] arr){
        int[] dp = new int[arr.length];
        for(int i=0;i<arr.length;i++)
            dp[i] =-1;
        return helper(n,arr,dp);
    }
    public static int helper(int n ,int[] arr,int[] dp){
        if(dp[n]==-1){
            if(n==0)
                return 0;
            int left =countJump(n-1,arr)+Math.abs(arr[n]-arr[n-1]);
            int right = Integer.MAX_VALUE;
            if(n>1)
                right =countJump(n-2,arr)+Math.abs(arr[n]-arr[n-2]);
            dp[n] = Math.min(left,right);
            return dp[n];
        }
        return dp[n];
    }
    
    //using Memoization without recursion
    public static int countJump2(int n , int[] arr){
        int[] dp = new int[arr.length];
        dp[0] =0;
        dp[1] = Math.abs(arr[0]-arr[1]);
        for(int i=2;i<=n;i++){
            int left = dp[i-2]+Math.abs(arr[i]-arr[i-2]);
            int right = dp[i-1]+Math.abs(arr[i]-arr[i-1]);
            dp[i] = Math.min(left,right);
        }
        return dp[n];
    }
    // constant space
    public static int countJump3(int n , int[] arr){

        int a =0;
        int b = Math.abs(arr[0]-arr[1]);
        for(int i=2;i<=n;i++){
            int left = a+Math.abs(arr[i]-arr[i-2]);
            int right = b+Math.abs(arr[i]-arr[i-1]);
            int temp = Math.min(left,right);
            a = b;
            b = temp;

        }
        return b;
    }
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50,10,102,405,697,5,7,6,7,8,4,6,7,8,9,5,4,3,2,3,4,};
        System.out.println("Using recursion : "+countJump(arr.length-1,arr));
        System.out.println("Using Memoization & Recursion : "+countJump1(arr.length-1,arr));
        System.out.println("Using Memoization : "+countJump2(arr.length-1,arr));
        System.out.println("Using Tabulation : "+countJump3(arr.length-1,arr));

    }
}
