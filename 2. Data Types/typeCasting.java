public class typeCasting {
    public static void main(String[] args) {
        // Implecit type conversion
        byte b = 90;
        int n = (int)b;

        long l = 90;
        int i = (int) l;
        System.out.println(i);

        // Explecit type conversion
        byte by = 127;
        by = (byte) (by + 1);
        System.out.println(by);

        int num1 = 9, num2 = 2;
        System.err.println((float)num1/num2);
    }
}
