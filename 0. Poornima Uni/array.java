import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int sum = 0, even = 0, odd = 0;
        int size = sc.nextInt();
        int a[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
            sum = sum + a[i];
            if (a[i] % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        System.out.println();
        System.out.println("Sum of all elements is: " + sum);
        System.out.println("Average of all elements is: " + (float) sum / size);
        System.out.println("Number of even elements are: " + even);
        System.out.println("Number of odd elements are: " + odd);

    }
}
