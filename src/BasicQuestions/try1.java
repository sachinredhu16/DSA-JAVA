package BasicQuestions;


import java.util.HashSet;

public class try1 {
    public static void main(String[] args) {
        int n = 5;
        int[] A = {1,2,3,4,5};
       String str = "wefiuw";
        HashSet<Integer> basket1 = new HashSet<>();
        HashSet<Integer> basket2 = new HashSet<>();
        int size =0;

        for(int i=0;i<n;i++){
            if(basket1.contains(A[i])){
                if (!basket2.contains(A[i])){
                    basket2.add(A[i]);
                }
            }
            else{
                basket1.add(A[i]);
            }
        }
        size = basket1.size()+ basket2.size();
        System.out.println(size);

    }
}
