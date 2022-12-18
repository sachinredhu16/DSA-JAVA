package string;

public class ReverseEachWord {
    public static String reverse(String str ){
        StringBuilder s = new StringBuilder(str);
        return String.valueOf(s.reverse());
    }
    public static void main(String[] args) {
        String str = "Welcome to Coding Ninjas";

        String res = "";

        int start=0;
        if(str.charAt(str.length()-1)!=' '){
            str += ' ';
        }
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)==' '){
               res += reverse(str.substring(start,i+1));
               start =i;
           }
            }
        System.out.println(res);

    }
}
