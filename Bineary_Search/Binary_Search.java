public class Binary_Search{

    public static void main(String[] args){
        int[] arr={-6,-4,-2,0,3,4,7,24,38,56};
        int target=24;
        int ans=bsearch(arr, target);
        System.out.println(ans);
    }
    static int bsearch(int[] arr , int target){
        int start=0;
        int end=arr.length -1;
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