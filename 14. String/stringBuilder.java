public class stringBuilder {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        String s = "abc";
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(20);


        System.out.println(sb.capacity()); // 16
        System.out.println(sb.length()); // 0

        System.out.println(sb1.capacity()); // 19
        System.out.println(sb1.length()); // 3

        System.out.println(sb2.capacity()); // 20
        System.out.println(sb2.length()); // 0
    }
}
