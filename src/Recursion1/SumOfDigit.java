package Recursion1;

public class SumOfDigit {

    public static int sum(int n ){
        if(n<10){
            return n;
        }
        int mod = n%10;
        return  mod+sum(n/10);
    }

    public static void main(String[] args) {
        int n = 12345;

        System.out.println(sum(n));

    }
}
