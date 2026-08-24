public class StringStart {
    public static void main(String[] args) {
        //String Literal
        String s1 = "Hello"; // Non primitive
        String s2 = "Hello"; // Non primitive

        // Using new keyword
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        
        System.out.println(s1==s2); // Compare value + adress
        System.out.println(s3==s4);
        System.out.println(s1.equals(s4));

    }
}
