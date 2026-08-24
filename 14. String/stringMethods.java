import java.util.Arrays;

public class stringMethods {
    public static void main(String[] args) {
        
        String s = "Hello";
        String s2 = "Hy";

        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.indexOf('l'));
        char arr[] =  s.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(s.substring(1,4));

        System.out.println(s.compareTo(s2));
    }
}
