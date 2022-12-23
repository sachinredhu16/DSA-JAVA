package Recursion.Recursion1;

public class FabonacciNumber {
    public static int fabNumber(int n){

        if(n==0 || n==1) {
            return n;
        }
        return fabNumber(n-1)+fabNumber(n-2);

    }
    public static void main(String[] args) {
        System.out.println(fabNumber(7));
    }
}
