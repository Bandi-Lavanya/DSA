import java.util.Arrays;
public class String_Methods{
    public static void main(String[] args){
        String name="Lavanya Rao Bandi";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
       // System.out.println("          Lavanya          ".strip()); can't work in earlier versions of java, instead use trim
        System.out.println("          Lavanya          ".trim());
        System.out.println(name.toLowerCase());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}