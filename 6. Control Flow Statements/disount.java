// Amount         |     Discount
// 0 - 5000       |     0%
// 5001 - 7000    |     5%
// 7001 - 9000    |     10%
// more than 9000 |     20%

import java.util.Scanner;

public class disount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        double finalAmount = 0;

        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        } else if (amount <= 5000) {
            System.out.println("No discount");
            finalAmount = amount;
        } else if (amount <= 7000) {
            System.out.println("Discount of 5% applied");
            finalAmount = amount - (amount * 0.05); //5%
        } else if (amount <= 9000) {
            System.out.println("Discount of 10% applied");
            finalAmount = amount - (amount * 0.1); //10%;
        } else {
            System.out.println("Discount of 20% applied");
            finalAmount = amount - (amount * 0.2); // 20%
        }
        System.out.println("Final Amount: " + finalAmount);
    }
}
