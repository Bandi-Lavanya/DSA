public class rotate_Bs_withDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 4, 3, 3};
        int ans = findPivot(arr);
        System.out.println("Pivot Index: " + ans);
    }

    static int BSearch(int[] arr, int target) {
        int pivot = findPivot(arr);

        // If no pivot is found, the array is not rotated
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // If pivot is found, two ascending sorted arrays exist
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
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
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // Skip duplicates, but check if start or end is the pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
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
