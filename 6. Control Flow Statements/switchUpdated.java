import java.util.Scanner;

public class switchUpdated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a char: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> {
                System.out.println("Vovel");
            }
            default -> {
                System.out.println("Consonant");
            }
        }
    }
}
