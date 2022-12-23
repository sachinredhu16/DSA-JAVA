package LinearDataStructure.Array;

public class RowWiseSum2D {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4},{5,6},{7,8}};

        // how to find Row and Column in 2D array
        System.out.println("Row is : "+arr.length);
        System.out.println("Column is : "+arr[0].length);

        int r = arr.length;
        int c = arr[0].length;
        for (int i=0;i<r;i++){
            int sum =0;
            for(int j=0;j<c;j++){
                sum +=arr[i][j];
            }
            System.out.println("Sum of "+(i+1)+" row is : "+sum);
        }
    }
}
