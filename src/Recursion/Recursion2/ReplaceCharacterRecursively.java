package Recursion.Recursion2;

public class ReplaceCharacterRecursively {

    public static String replace(String str,char c1, char c2){
        if(str.length()==0)
            return "";

        char c ;
        if(str.charAt(0)==c1)
            c = c2;
        else
            c = str.charAt(0);

        String ans = replace(str.substring(1),c1,c2);
        return (c+ans);


    }
    public static void main(String[] args) {

        String str = "axbcxdefx";

        System.out.println(replace(str,'x','z'));
    }
}
