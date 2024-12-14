//Find first and last position of elements in sorted array
//nums=[1,3,5,6,6,6,9] target=6 output:[3,4]
public class First_last_element {
    public static void main(String[] args) {
        int[] arr = {-6, -4, -2, 0, 3, 4, 7, 24, 24, 24, 38, 38, 56};
        int target = 24;
        int[] result = searchrange(arr, target); // Correctly expect an array result
        System.out.println("First position: " + result[0] + ", Last position: " + result[1]);
    }

    // Method to find the first and last positions of the target
    static int[] searchrange(int[] arr, int target) { 
        int[] ans = {-1, -1}; // Initialize array to store the result

        // Check for first and last occurrence
        int start = search(arr, target, true); // Find the first occurrence
        int end = search(arr, target, false); // Find the last occurrence

        ans[0] = start; // Set first position
        ans[1] = end; // Set last position

        return ans; // Return the result array
    }

    // Helper method to perform binary search
    static int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1; // Default answer when target is not found
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Mid-point to avoid overflow
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // Potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1; // Move to the left to find the first occurrence
                } else {
                    start = mid + 1; // Move to the right to find the last occurrence
                }
            }
        }
        return ans; // Return the index
    }
}
