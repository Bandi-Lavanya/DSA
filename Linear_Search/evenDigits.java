//Find number of numbers that having even number of digits

public class evenDigits{
    public static void main(String[] args){
        int[] nums={ 123, 12 ,34 ,999, 1254, 67 ,9, -1234};
        int ans= FindNumbers(nums);
        System.out.println(ans);

    }

    static int FindNumbers(int[] nums){
        int count=0;
        for (int num: nums){
            if(even(num)){
                count++;

            }
        }
      return count;
    }
    static boolean even(int num){
        int noofDigits= digits(num);
        /*if(noofDigits % 2 ==0){
            return true;
        }
        else{
            return false;
        }*/
       return (noofDigits % 2 ==0);
    }
    //to count the number of digits in a number
    static int digits(int num){
        /*Shortcut to find no. of digits
        return (int)(Math.log10(num))+1;*/
        
        num=Math.abs(num);//converting the negative number into positive
        if(num==0){
            return 1;
        }
       int count=0;
       while(num>0){
        count++;
        num=num/10;
       }
       return count;
    }
}