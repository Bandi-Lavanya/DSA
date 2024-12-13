import java.util.Arrays;

public class max_in2D{
 public static void main(String[] args){
    int[][] arr={
        {23, 4 ,5},
        {21, 19, 16},
        {11, 5, 8}
    };
    int ans=max(arr);// format of return value is {row,col}
    System.out.println(ans);
 }
 // search in 2D array
   static int max(int[][] arr){
    int max=Integer.MIN_VALUE;//It is the min value of an integer
    for(int[] ints:arr){
        for(int element :ints){
            if(element>max){
                max=element;
            }
        }
    }
    return max;

   }
}