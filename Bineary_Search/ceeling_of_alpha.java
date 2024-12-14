//ceeling of a alphabets-- find the smallest alphabet in array that is > or = the target element.
// example arr=[a,b,e, y,z], target= c , then the elment is e
//if target== z the element is a(letters are wrap around)
public class ceeling_of_alpha{

    public static void main(String[] args){
        char[] arr={'a','b','e', 'y','z'};
        char target='c';
        char ans=bsearch(arr, target);
        System.out.println(ans);
    }
    static char bsearch(char[] arr , char target){
        int start=0;
        int end=arr.length -1;
        while(start <= end){
            //int middle=(start+end)/2; (start+end) might exceed the range of int in Java
            int mid=start+ (end-start)/2;
            if(target < arr[mid]){
                end= mid-1;
            }
            else{
                start= mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}