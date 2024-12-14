// Find position of an element in a sorted array of infinite numbers(i.e try not using arr.length)
//Insted we can divide the array into chunks-->reverse Binary search(doubling the size of the array for every step)
public class Find_in_infinitearray{
    public static void main(String[] args){
        int[] arr={-6, -4, -2, 0, 3, 4, 7, 24, 24, 24, 38, 38, 56.65,73,78,91,101};//error may occur because we taken a finite array here
        int target=24;
        System.out.println(ans(arr,target));
    }
    static  int ans(int[] arr , int target){
        // find the range, first start with box of size 2
        int start=0;
        int end=1;
        //condition for the target to lie in the range
        while(target > arr[end]){
            int newStart=end+1;
            //double the box value
            end=end + (end - start + 1)* 2;
            //[1, 2, 3, 4, 5 ,6, 7, 8] 
            // 0  1  2  3  4  5  6  7 here we need [4, 5, 6, 7] that 4 is start and 7 is end- (start-1)--> end - start + 1
            start= newStart;

        }
        return bsearch(arr, target, start,end);
    }
    static int bsearch(int[] arr , int target,int start,int end){
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
}