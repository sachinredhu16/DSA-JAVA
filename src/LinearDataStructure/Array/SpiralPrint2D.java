package LinearDataStructure.Array;

import java.util.ArrayList;
import java.util.List;

public class SpiralPrint2D {
    public static void main(String[] args) {
        // this is not optimized because of O(N*N)
        List<Integer> list = new ArrayList<>();
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int rowStart =0;
        int colStart =0;
        int row = matrix.length;
        int col = matrix[0].length;
        int t = row*col; int c=0;
        int i;
        while(c<t){
            for(i =colStart;i<col && c<t;i++){
                list.add(matrix[rowStart][i]);
                c++;
            }
            rowStart++;
            for(i = rowStart;i<row && c<t;i++){
                list.add(matrix[i][col-1]);
                c++;
            }
            col--;
            for(i =col-1;i>=colStart && c<t;i--){
                list.add(matrix[row-1][i]);
                c++;
            }
            row--;
            for(i = row-1;i>=rowStart && c<t;i--){
                list.add(matrix[i][colStart]);
                c++;
            }
            colStart++;
        }
        System.out.println(list);
        }

}
