package BasicQuestions;

public class try1 {
    public static void increment(int i){
        i++;
    }
    public static void increment(int []	arr)
    {
        for (int i=0;i<5;i++){
            arr[i]++;
        }
    }
    public static void main(String[] args) {
    int num=10;

    increment(num);
    System.out.println("Element is :- "+num);


    int[] arr = {1,2,3,4,5};
    increment(arr);
        for (int element:arr) {
            System.out.print(element+" ");
        }
    }
}
