package string;

public class Palindrome {
    public static void main(String[] args) {
        String s = "abcdcb";
        boolean isPlaindrome = true;
        int i=0;
        int j = s.length()-1;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)){
                isPlaindrome = false;
                break;
            }
            i++;j--;

        }
        System.out.println("Palidrome is : "+isPlaindrome);
    }
}
