//Mountain array-numbers increases and then decreases

public class Peak_index_in_mountainarray{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,4,3};
        int ans=PeakIndex(arr);
        System.out.println(ans);

    }
    static int PeakIndex(int[] arr){
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
        return arr[start]; //or return end;
    }
}