package Recursion.Recursion2;

public class PairStar {

    public static String addStar(String str){
        if(str.length()==1){
            return str;
        }

        String ans = addStar(str.substring(1));
        if(str.charAt(0)==str.charAt(1)){
            ans = str.charAt(0)+"*"+str.charAt(1)+ans.substring(1);
        }
        else {
            ans = str.charAt(0)+ans;

        }

        return ans;

    }

    public static void main(String[] args) {
        String s= "helloo";

//        output -->> hel*lo*o

        System.out.println(addStar(s));

    }
}
