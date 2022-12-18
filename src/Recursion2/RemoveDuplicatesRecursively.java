package Recursion2;

public class RemoveDuplicatesRecursively {

    public static String removeDupl(String str ){
        if(str.length()==0)
            return "";
        char c = str.charAt(0);

        String ans = removeDupl(str.substring(1));
        if(!ans.isEmpty() && ans.charAt(0)==c){
            return ans;
        }
        else
            return (c+ans);
    }

    public static void main(String[] args) {
        String str = "aabbbccccddee";
        System.out.println(removeDupl(str));

    }
}
