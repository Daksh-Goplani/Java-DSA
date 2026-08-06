import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();

        if(num1> num2){
            System.out.println("Greatest number is: " + num1);
        }
        else{
            System.out.println("Greatest number is: " + num2);
        }
    }
}
