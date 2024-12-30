import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class find_duplicate {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 6, 8, 10, 8, 12};
        List duplicate = finddupli(arr);
        System.out.println("The duplicate number is: " + duplicate);
    }

    static List<Integer> finddupli(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1; // The correct index for the current element
                if (arr[i] != arr[correct]) { // Checking if the wrong index is a unique element
                    swap(arr, i, correct); // Swap to place the element in the correct position
                } else {
                    return arr[i]; // Return the duplicate number when found
                }
            } else {
                i++; // Move to the next index
            }
        }
        return -1; // If no duplicate is found
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
