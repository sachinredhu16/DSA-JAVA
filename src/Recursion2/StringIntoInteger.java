package Recursion2;

public class StringIntoInteger {

    public static int convert(String str ){
        if(str.length()==1)
            return str.charAt(0)-'0';

        int smallOutput = convert(str.substring(0,str.length()-1));
        int lastDigit = str.charAt(str.length()-1)-'0';
        return smallOutput*10+lastDigit;
    }

    public static void main(String[] args) {

        String str = "1234";
        System.out.println(convert(str));

        System.out.println(str.substring(1));
        System.out.println(str.substring(0,1));

    }
}
