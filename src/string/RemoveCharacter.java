package string;

public class RemoveCharacter {
    public static void main(String[] args) {

        String str = "aabbccddeeaa";
        char c = 'a';
        String res= "";

        for (int i=0;i<str.length();i++){
            if(str.charAt(i)!=c){
                res += str.charAt(i);
            }
        }
        System.out.println("String after removing '"+c+"' is : "+res);
    }
}
