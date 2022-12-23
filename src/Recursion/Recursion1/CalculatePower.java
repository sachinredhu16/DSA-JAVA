package Recursion.Recursion1;

public class CalculatePower {
    public static int power(int num, int pow){
        if(pow==0){
            return 1;
        }
        return num*power(num,pow-1);
    }
    public static void main(String[] args) {
        int num = 3;
        int pow = 4;

        System.out.println("Number is : "+ power(3,4));
    }
}
