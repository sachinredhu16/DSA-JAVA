package DP;

public class Fibonacci {

    // usingRecursion it take 2^n time to find fab number
    public static int fab1(int n){
        if(n==0 || n==1)
            return n;
        return fab1(n-1)+fab1(n-2);
    }

    // using Dynamic Programming/Memoization it takes 2n-1 means O(n) time to find fibonacci number

    public static int fab2(int n ){
        int[] arr = new int[n+1];
        for(int i=0;i<arr.length;i++){
            arr[i] =-1;
        }
        return fab3(n,arr);
    }
    // below method is using Memoization | uses recursion | top-to-bottom approch
    private static int fab3(int n , int[] arr){
        if(arr[n]!=-1)
            return arr[n];
        if(n==0 || n==1){
            arr[n] = n;
            return arr[n];
        }
        arr[n] = fab3(n-1,arr) + fab3(n-2,arr);
        return arr[n];
    }

    // below method is using DP | iterative approach | bottom-up approach
    public static int fab4(int n){
        int[] arr = new int[n+1];
        arr[0] =0;
        arr[1] =1;
        for(int i=2;i<=n;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }


    public static void main(String[] args) {

        System.out.println("using DP : "+fab4(500));
        System.out.println("using Memoization : "+fab2(500));
        System.out.println("using Recursion : "+fab1(40));
    }
}
