package BasicQuestions;

public class LCM {
    public static void main(String[] args) {
        int num1=10;
        int num2=5;

        int lcm = num2;
        while(lcm%num1!=0){
            lcm +=num2;
        }
        System.out.println(lcm);
    }
}
