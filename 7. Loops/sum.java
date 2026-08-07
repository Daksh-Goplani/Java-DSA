import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int range = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= range; i++) {
            sum += i;
        }
        System.out.println("Sum of all natural number from " + range + " is " + sum);
    }
}
