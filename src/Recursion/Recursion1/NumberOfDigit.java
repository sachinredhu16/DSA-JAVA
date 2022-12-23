package Recursion.Recursion1;

public class NumberOfDigit {

    public static int digit(int num){

        if(num==0){
            return 0;
        }
        int count = digit(num/10);
        return count+1;

    }
    public static void main(String[] args) {
        System.out.println(digit(153));
    }
}
