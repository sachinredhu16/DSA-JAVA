package Recursion.Recursion1;

public class CountZero {
    public static int count(int n ,int count){
        if(n>0 && n%10==0){
            count++;
        }
        if(n==0){
            return count;
        }
        return count(n/10,count);
    }
    public static void main(String[] args) {
        int n = 19808000;
        System.out.println(count(n,0));
    }
}
