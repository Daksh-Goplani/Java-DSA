public class stringBuilderMethods {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Daksh Goplani");

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.deleteCharAt(5);
        sb.delete(5, 12);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
