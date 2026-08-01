public class primitive {
    public static void main(String[] args) {
        byte b = 100;
        short s = 200;
        int i = 1_23_456;
        long l = 1234567890;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        float f = 1.4f;
        double d = 23.32;

        System.out.println(f);
        System.out.println(d);

        char ch = 'a';
        boolean bool = true;

        System.out.println(ch);
        System.out.println(bool);

        int ascii = 'a';
        System.err.println(ascii); // 97
    }
}
