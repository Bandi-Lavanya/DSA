import java.util.Arrays;

public class Missing_number {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4};
        int missing = findMissingNumber(arr);
        System.out.println("The missing number is: " + missing);
    }

    static int findMissingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1; // The correct index for the current element
            if (arr[i] <= arr.length && arr[i] != arr[correct]) {
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
