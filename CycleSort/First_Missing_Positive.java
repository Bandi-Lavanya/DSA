import java.util.Arrays;

public class First_Missing_Positive {

    public static void main(String[] args) {
        int[] arr = {-1,0,3,2,1};
        int missing = Missingpositive(arr);
        System.out.println("The missing number is: " + missing);
    }

    static int Missingpositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1; // The correct index for the current element
            //igmore negatives
            if (arr[i]> 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct); // Swap to place the element in the correct position
            } else {
                i++; // Move to the next index
            }
        }

        // Search for the first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                // Case 1: Found the missing number
                return index + 1;
            }
        }

        // Case 2: If all numbers are in place, the missing number is `n + 1`
        return arr.length + 1;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
