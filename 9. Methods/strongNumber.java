public class strongNumber {
    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 145, copy = n, sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            int fact = fact(lastDigit);
            sum += fact;
            n /= 10;
        }

        System.out.println(sum == copy ? "Strong number" : "Not a strong number");

    }
}
