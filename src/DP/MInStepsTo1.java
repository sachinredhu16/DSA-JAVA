package DP;

public class MInStepsTo1 {

    public static int steps(int n ){
        int count =0;
        while(n!=1){
            if(n%3==0)
                n = n/3;
            else if (n%2==0)
                n = n/2;
            else
                n -=1;
            count++;

        }
        return count;
    }

    public static void main(String[] args) {
        int n =5;
        System.out.println("Steps is : "+steps(n));
    }
}
