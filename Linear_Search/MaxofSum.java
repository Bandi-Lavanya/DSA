//In 2D array, each array has the wealth of a person , find which person has max wealth by adding the elements in each array.
public class MaxofSum{
    public static void main(String[] args){
        int[][] accounts={
        {23, 4 ,5},
        {21, 19, 16},
        {11, 5, 8}
    };
    int result=maxWealth(accounts);
    System.out.println(result);

    }
    static int maxWealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        for (int person =0; person < accounts.length; person++){
            int sum=0;
            for (int account =0; account<accounts[person].length; account++ ){
                sum+= accounts[person][account];
            }
            //check with overall answer
            if(sum > ans){
                ans=sum;
            }
        }
        return ans;
    }
}