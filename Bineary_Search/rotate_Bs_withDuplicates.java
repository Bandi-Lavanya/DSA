//not works for duplicate value

public class rotate_Bs_withDuplicates{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,5,6,4,3,3};
        int ans=findPivot(arr);
        System.out.println(ans);

    }

    static int BSearch(int[] arr,int target){
        int pivot=findPivot(arr);
        //if you dont find your pivot, it means the array is not rotated
        if(pivot==-1){
            //just do normal BS
            return binarySearch(arr,target,0,arr.length-1);
        }
        //if pivot is found 2 ascending sorted arrays
        // 3 cases
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,0,arr.length-1);
    }
static int binarySearch(int[] arr, int target, int start,int end){

        while(start <= end){
            //int middle=(start+end)/2; (start+end) might exceed the range of int in Java
            int mid=start+ (end-start)/2;
            if(target < arr[mid]){
                end= mid-1;
            }
            else if(target>arr[mid]){
                start= mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<= end){
            int mid=start+ (end-start)/2;
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid+1]){
                //you are in the decreasing part of the array
                //this may be the answer but look at the left
                //this is why the end !=mid-1
               return mid;
            }
            if(mid > start && arr[mid] < arr[mid+1]){
                //you are in the ascending part of the array
                return mid-1;
            }
            //if elements at the middle, start, end  are equal the just skip the duplictaes
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates
                //Note: what if these elemnts at the start and end were the pivot?
                //check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                return start;
            }
            start++;
            if (end > start && arr[end] < arr[end - 1]) {
                return end - 1;
            }
            end--;
        }
        // Case 3: Normal binary search logic
        else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return -1; // Pivot not found
    }}