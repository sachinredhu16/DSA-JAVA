package DP;

import java.util.HashSet;

public class MInStepsTo1 {

    // using recursion
    public static int countSteps(int n ){
        if(n==1)
            return 0;

        int opt1=countSteps(n-1);
        int minSteps =opt1;
        if(n%3==0){
            int opt2 = countSteps(n/3);
            if (minSteps>opt2)
                minSteps = opt2;
        }
        if(n%2==0){
            int opt3 = countSteps(n/2);
            if (minSteps>opt3)
                minSteps = opt3;
        }

        return 1+minSteps;
    }

    // using memoization
    public static int countSteps2(int n ){
        int[] arr = new int[n+1];
        for(int i=0;i<arr.length;i++){
            arr[i] =-1;
        }
        return countSteps3(n,arr);
    }
    public static int countSteps3(int n , int[] arr){
        if(arr[n]!=-1)
            return arr[n];
        if(n==1){
            arr[n] = 0;
            return arr[n];
        }
        int opt1=countSteps3(n-1,arr);
        int minSteps =opt1;
        if(n%3==0){
            int opt2 = countSteps3(n/3,arr);
            if (minSteps>opt2)
                minSteps = opt2;
        }
        if(n%2==0){
            int opt3 = countSteps3(n/2,arr);
            if (minSteps>opt3)
                minSteps = opt3;
        }
        arr[n] =  1+minSteps;
        return arr[n];
    }

    //using DP
    public static int countSteps4(int n){
        int[] arr = new int[n+1];
        arr[1] = 0;
        for(int i=2;i<=n;i++){
            int opt1 = arr[i-1];
            int minStep = opt1;
            if(i%3==0){
                int opt3= arr[i/3];
                if (opt3<minStep)
                    minStep=opt3;
            }
            if(i%2==0){
                int opt2= arr[i/2];
                if (opt2<minStep)
                    minStep=opt2;
            }

            arr[i] = minStep+1;
        }
        return arr[n];
    }

    public static void main(String[] args) {

        int n =300;
        System.out.println("Steps is : "+countSteps4(n));
        System.out.println("Steps is : "+countSteps2(n));
        System.out.println("Steps is : "+countSteps(n));
    }
}
