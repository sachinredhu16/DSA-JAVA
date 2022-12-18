package string;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String str = "b";

        String res = "";
        char temp = 0;
        if(!str.isEmpty()){
            res +=str.charAt(0);
            temp = str.charAt(0);
        }
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=temp){
                res +=str.charAt(i);
                temp = str.charAt(i);
            }
        }
        System.out.println(res);
    }
}
