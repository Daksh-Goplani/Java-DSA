import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = sc.nextInt();

        int arr[] = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondLargest = 0;

        for (int i = 0; i < len; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (largest > arr[i] && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest Elem: " + largest);
        System.out.println("Second Largest Elem: " + secondLargest);
    }
}
