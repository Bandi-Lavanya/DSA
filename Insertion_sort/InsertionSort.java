import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 4, 5, -6, 10, 19, -31};
        insertion(arr);
        System.out.println("Selection Sort: " + Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j=i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
