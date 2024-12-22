// here we need to find the largest sum of numbers in a non empty continues sub array
//here the array is not in sorted order, but we can use BSearch for this
public class split_array_largest_sum{
    public static void main(String[] args){
        int[] arr = {4, 5, 6, 7, 8,9, 10, 0, 1, 2};
        int m =2;
        System.out.println("Largest Sum: " + splitArray(arr,m));

    }
    static int splitArray(int[] nums, int m){
        int start=0;
        int end=0;
        for(int i=0; i< nums.length; i++){
            start = Math.max(start,nums[i]);// in the end of the loop this will contain the max item from the array
            end += nums[i];
        }
        //binary Search
        while(start < end){
            //try for the middle as potential ans
            int mid= start + (end-start)/2;
            // calculate how many pieces you can divide this in with the max sum
            int sum=0;
            int pieces=1;
            for(int num: nums){
                if(sum + num > mid){
                    //you can't add this in sub array , make new one
                    // say you add this in new sub array , then sum=num
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }
            if(pieces > m){
                start = mid +1;
            } else{
                end=mid;
            }
        }
        return end;// here start == end
     }
}