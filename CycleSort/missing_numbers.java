import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class missing_numbers {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4};
        List missing = findMissingNumber(arr);
        System.out.println("The missing number is: " + missing);
    }

    static List<Integer> findMissingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1; // The correct index for the current element
            if (arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct); // Swap to place the element in the correct position
            } else {
                i++; // Move to the next index
            }
        }

        // Search for the first missing numbers
        List<Integer> ans= new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
