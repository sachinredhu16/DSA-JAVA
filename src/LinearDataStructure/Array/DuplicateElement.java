package LinearDataStructure.Array;

public class DuplicateElement {
    public static void main(String[] args) {

        int [] arr = {100,200,300,400,800,500,600,700,800};
        int n = arr.length;
        // duplicate = (sum of all element)-(sum of n natural number)

        int naturalNo = (n)*(n-1)/2;
        int sum =0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Duplicate number is : "+(sum-naturalNo));
    }
}
