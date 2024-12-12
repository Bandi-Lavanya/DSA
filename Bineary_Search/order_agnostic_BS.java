public class order_agnostic_BS{

    public static void main(String[] args){
       int[] arr={-6,-4,-2,0,3,4,7,24,38,56};
        int target=24;
        int ans=bsearch(arr, target);
        System.out.println(ans);
           
    }
    static int bsearch(int[] arr, int target){
         int start=0;
         int end=arr.length-1;

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