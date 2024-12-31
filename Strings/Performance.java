public class Performance{
public static void main(String[] args){
    String series ="";
    for(int i=0; i<26; i++){
        char ch=(char)('a'+i);// Here we are adding the the ascii values to ascii value of 'a' and converting them into characters using char
        series= series + ch; // adding all the characters to gether
        System.out.println(series);// creates a pattern
    }
    System.out.printf("The all characters are: %s",series); 
}
}