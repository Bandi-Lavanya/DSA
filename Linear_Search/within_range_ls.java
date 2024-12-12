//Searching for a number with in a given range 
public class within_range_ls{
    public static void main(String[] args){
        int[] nums={12,13,10,2,-3,14,-16,43,-11};
        int target=14;
        System.out.println(linearSearch(nums,target, 3,7));
        
    }
    static int linearSearch(int[] nums, int target, int start, int end){
        if(nums.length ==0){
            return -1;
        }
        for(int i=start; i<=end; i++){
            if(nums[i]==target){
                return i;
            }
        }
       return -1; 
    }
}