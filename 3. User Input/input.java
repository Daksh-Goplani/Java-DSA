import java.util.Scanner;

public class input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter first number: ");
        // int num1 = sc.nextInt();

        // System.out.print("Enter second number: ");
        // int num2 = sc.nextInt();
        // System.out.println("Sum = " + (num1 + num2));

        // char ch = sc.next().charAt(0); // abc -> a
        // System.out.println(ch);

        
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter your name: ");
        // String s = sc.next(); // Daksh Goplani -> Daksh
        String s1 = sc.nextLine(); // Daksh Goplani -> Daksh Goplani

        System.out.println("Name: " + s1 + " you are "+ age + " years old");
    }
}