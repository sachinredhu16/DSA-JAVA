package Recursion2;

public class RemoveCharString {

    public static String remove(String str,char c1){
        if(str.length()==0 ){
            return "";
        }
        String c;
        if(str.charAt(0)==c1)
            c="";

        else{
            c = String.valueOf(str.charAt(0));
        }
        String ans = remove(str.substring(1),c1);
        if(!c.isEmpty())
            return (c+ans);
        else
            return ans;
    }

    public static void main(String[] args) {
        String str = "abcbdbebf";
        System.out.println(remove(str,'b'));

    }
}
