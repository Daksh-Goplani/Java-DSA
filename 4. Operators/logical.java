public class logical {
    public static void main(String[] args) {
        System.out.println(10 > 5 && 1 > 2);
        System.out.println(10 > 5 && 1 < 2);
        System.out.println(10 > 5 || 1 < 2);
        System.out.println(10 > 5 || 1 > 2);

        int a = 12, b = 22;
        System.out.println(a++ > 12 && b++ > 22);
        System.out.println(a + " " + b); // 13 22
        // System.out.println(a++ > 13 || b++ >= 22);

    }
}
