import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 4, 5, -6, 10, 19, -31};
        selection(arr);
        System.out.println("Selection Sort: " + Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the max item in the remaining array and swap with correct index
            int last = arr.length - 1 - i; // Reduce the range in each iteration
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    
}
