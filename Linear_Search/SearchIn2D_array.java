import java.util.Arrays;

public class SearchIn2D_array{
 public static void main(String[] args){
    int[][] arr={
        {23, 4 ,5},
        {21, 19, 16},
        {11, 5, 8}
    };
    int target=8;
    int ans[]=linearSearch(arr, target);// format of return value is {row,col}
    System.out.println(Arrays.toString(ans));
 }
 // search in 2D array
   static int[] linearSearch(int[][] arr, int target){
    for(int row=0; row< arr.length; row++){
        for(int col=0; col<arr.length; col++){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
        }
    }
    return new int[]{-1,-1};

   }
}