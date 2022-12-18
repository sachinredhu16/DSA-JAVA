package Recursion2;

public class ReplacePi {

    public static int countPi(String str ){
        if(str.length()==1){
            return 0;
        }
        int count =0;
        if(str.charAt(0)=='p' && str.charAt(1)=='i'){
            count = 1;
        }
        int res = countPi(str.substring(1));
        return count+res;
    }


    public static void main(String[] args) {
        String str = "pipi";
        int count = countPi(str);
        System.out.println(count);

        for(int i=0;i<count;i++){
            System.out.print("3.14");
        }
    }
}
