import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Before swap:\nNum1 = " + num1 + "\nNum2 = " + num2);
        
        // int temp = num1;
        // num1 = num2;
        // num2 = temp;

        // Without 3rd Variable:

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("\nAfter Swap swap:\nNum1 = " + num1 + "\nNum2 = " + num2);
    }
}
