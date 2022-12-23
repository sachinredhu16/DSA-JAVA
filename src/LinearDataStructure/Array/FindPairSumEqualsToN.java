package LinearDataStructure.Array;

public class FindPairSumEqualsToN {
    public static void main(String[] args) {
        int[] arr = {1, 3 ,6, 2, 5 ,4, 3, 2 ,4};
        int sum =7;
        int pair =0;

        for(int i=0;i<arr.length-1;i++){
            int x = arr[i];
            for(int j=i;j<arr.length;j++){
                if(x+arr[j]==sum){
                    pair++;
                }
            }
        }
        System.out.println("Pair is : "+pair);
    }
}
