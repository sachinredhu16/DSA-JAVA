package BasicQuestions;


import java.util.*;

public class try1 {
    public static void main(String[] args) {
        int[] num = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 516;
        LinkedList<Integer> res=new LinkedList<>();
        int len=num.length-1;
        while(len>=0 || k>0){
            if(len>=0){
                k+=num[len--];
            }
            res.addFirst(k%10);
            k/=10;
        }
    }
}
