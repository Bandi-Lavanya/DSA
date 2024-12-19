public class find_in_mountainArray{

    public static void main(String[] args){
       int[] arr={-6,-4,-2,0,3,4,7,24,38,56,36,12,9,4};
        int target=24;
        int ans=Search(arr, target);
        System.out.println(ans);
           
    }
    
    static int Search(int[] arr, int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry=orderAgnosticBS(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        //try to search in second half
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }

    static int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start< end){
            int mid=start+ (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                //you are in the decreasing part of the array
                //this may be the answer but look at the left
                //this is why the end !=mid-1
                end=mid;
            }
            else{
                //you are in the ascending part of the array
                start=mid+1; //because we know that mid+1 > mid
            }
        }
        //in the end, start== end and pointing to the largest number beacause of the two conditions
        //when start and end are ponting towrds the same element that is the peak
        return start; //or return end;
    }


    static int orderAgnosticBS(int[] arr, int target, int start ,int end){

         //find wheather the array is sorted in assending or decending order
         /*boolean isAsc;
         if(arr[start] < arr[end]){
            isAsc=true;
         }
         else {
            isAsc=false;
         }*/

        boolean isAsc=arr[start] < arr[end];

        
     while(start <= end){
            //int middle=(start+end)/2; (start+end) might exceed the range of int in Java
            int mid=start+ (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }

             // if it is in Ascending order
            if(isAsc){
            if(target < arr[mid]){
                end= mid-1;
            }
            else {
                start= mid + 1;
            }
            
        } else{ //if it is not in  ascending that is in decending order
            if(target > arr[mid]){
                end= mid-1;
            }
            else {
                start= mid + 1;
            }
        }
    }
    return -1;
}
}