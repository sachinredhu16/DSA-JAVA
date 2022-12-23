package LinearDataStructure.Array;

public class SpiralPrint2D {
    public static void main(String[] args) {
        // this is not optimized because of O(N*N)
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16} };
        int row = arr.length;
        int col = arr[0].length;
        int rowStart =0;
        int colStart =0;
        int elements = row*col; int count =0;
        int i;
        while (count<elements){
            for( i=colStart;i<col;i++){
                System.out.print(arr[rowStart][i]+" ");
                count++;
            }
            rowStart++;
            for( i=rowStart;i<row;i++){
                System.out.print(arr[i][col-1]+" ");
                count++;
            }
            col--;
            for(i = col-1;i>=colStart;i--){
                System.out.print(arr[row-1][i]+" ");
                count++;
            }
            row--;
            for(i=row-1;i>=rowStart;i--){
                System.out.print(arr[i][colStart]+" ");
                count++;
            }
            colStart++;

        }
    }
}
