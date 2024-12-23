import java.util.Arrays;
public class bubble_sort{
    public static void main(String[] args){
        int[] arr={12, 13 , 1 , 4, 5, -6, 10, 19, -31};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0;i<arr.length; i++){
            swapped= false;
           //for each step,max item will come at the last respective index
           for(int j=1;j<arr.length-i; j++ ){
            //swap if the item is smaller than the previous item
            if(arr[j] < arr[j-1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                swapped=true;
            }
           }
           //if the swaping not occurs for a particular value of i , that is the array is already sorted
           if(!swapped){// !false=true
            break;
           }
        }
    }
}