public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8,9, 10, 0, 1, 2};
        System.out.println("Rotation Count: " + countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: Check if mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: Check if mid-1 is the pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: Handle duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // Check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // Check if end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            // Case 4: Binary search logic
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // Pivot not found
    }
}
