// Inside the swap fnc only value pass not the variable so a and b will remain same in the main means pass by value

public class swap {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
    }

    public static void main(String[] args) {

        int a = 5, b = 10;

        swap(a, b);
        System.out.println("a = " + a + ", b = " + b);

    }
}
