package Genrics;

public class GenricsMethod {

    // just put <T> before return type and method will be genricsMethod

    public static <T> void print(T arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
