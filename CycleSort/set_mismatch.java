import java.util.Arrays;

public class set_mismatch {

    public static void main(String[] args) {
        int[] arr = {2,1,4,2,6,5};
        int[] result = mismatch(arr);
        System.out.println("The duplicate and missing numbers are: " + Arrays.toString(result));
    }

    static int[] mismatch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] <= 0 || arr[i] > arr.length) {
                i++;
                continue; // Skip invalid numbers
            }
            int correct = arr[i] - 1; // The correct index for the current element
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct); // Swap to place the element in the correct position
            } else {
                i++; // Move to the next index
            }
        }

        // Search for the first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                // Case 1: Found the duplicate value and missing number 
                return new int[] {arr[index], index + 1};
            }
        }

        // Case 2: If there are no missing numbers and duplicates
        return new int[] {-1, -1};
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
