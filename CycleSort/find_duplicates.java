import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class find_duplicates {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 6, 8, 10,10, 8, 12};
        List<Integer> duplicate = finddupli(arr);
        System.out.println("The duplicate numbers are: " + duplicate);
    }

    static List<Integer> finddupli(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (arr[i] <= 0 || arr[i] > arr.length) {
                i++;
                continue; // Skip invalid numbers
            }

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1; // The correct index for the current element
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct); // Swap to place the element in the correct position
                } else {
                    if (!duplicates.contains(arr[i])) {
                        duplicates.add(arr[i]); // Add the duplicate number
                    }
                    i++;
                }
            } else {
                i++;
            }
        }
        return duplicates;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
