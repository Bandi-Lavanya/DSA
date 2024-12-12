 //linear search in string
 public class str_linear_search{
    public static void main(String[] args){
    String str="Lavanya Bandi";
    char c='y';
    boolean ans=linearSearch(str,c);
    System.out.println(ans);
 }
 static boolean linearSearch(String str, char c){
    if(str.length()==0){
        return false;
    }

    for(int i=0;i< str.length(); i++){
        if(str.charAt(i)== c){
            return true;
        }
    }
    /* Or we can use toCharArray in place of str.length()
    for( char ch: str.toCharArray()){
    if(ch==c){
    return true;
    }
    }*/
    return false;
 }
 }