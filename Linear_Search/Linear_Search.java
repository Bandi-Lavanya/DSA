/* Time Complexity: 
best case=O(1) and worst case=O(N) here N=size of array
right click-> refactor--> rename = to change a single varaible in entire code
*/

 public class Linear_Search{
    public static void main(String[] args){
        int[] nums={12, 13 , 1 , 4, 5, -6, 10, 19, -31};
        int target=4;
        int ans=linearSearch(nums, target);
        System.out.println(ans);

    }
    static int linearSearch(int[] arr,int target) {
        if(arr.length == 0){
            return -1;
        }
        for (int i=0; i< arr.length; i++){
            if (arr[i]== target){
                return i;
            }
        }
        return -1;// if element not exist
    }
 
 }


