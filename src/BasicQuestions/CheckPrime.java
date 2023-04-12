package BasicQuestions;

import java.util.function.Predicate;

public class CheckPrime {
    static Predicate<Integer> pred = (n)->{
        int temp =(int)Math.sqrt(n);
        while(temp>1){
            if(n%temp==0)
                return false;
            temp--;
        }
        return true;
    };
    public static void main(String [] argh)
    {
        System.out.println(pred.test(883));
    }
}
