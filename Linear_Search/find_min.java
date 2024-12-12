// Finding the minimum number among the given number using linear search
public class find_min{
    public static void main(String[] args){
        int[] arr={12, 13 , 1 , 4, 5, -6, 10, 19, -31};
        int m=min(arr);
        System.out.println(m);
    }
    static int min(int[] arr) {
        int ans=arr[0];
        for (int i=1; i< arr.length; i++){
            if (arr[i] < ans){
                ans=arr[i];
            }
        }
        return ans;// if element not exist
    }
 }