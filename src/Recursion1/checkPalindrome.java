package Recursion1;

public class checkPalindrome {

    public static boolean check(String s){
        if(s.length()<=1){
            return true;
        }
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return check(s.substring(1,s.length()-1));
        }
        else
            return false;


    }

    public static void main(String[] args) {
        String str = "racecarq";

        System.out.println("Palindrome is : "+check(str));

    }
}
