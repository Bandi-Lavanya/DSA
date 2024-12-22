import java.util.Arrays;
public class row_col_Matrix{
    public static void main(String[] args){
        int[][] arr={
            {1, 2, 4},
            {5, 6, 8},
            {13 ,15, 17}
                   };
                   int target = 15;
        System.out.println(Arrays.toString(search(arr, target)));

    }
    static int[] search(int[][] matrix , int target){
        int r=0;
        int c = matrix.length-1;
        while(r < matrix.length && c >= 0 ){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}