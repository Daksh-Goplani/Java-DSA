import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elem: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter element in sorted manner: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element on position " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target elem: ");
        int target = sc.nextInt();

        int start = 0, end = size - 1, mid, index = -1;

        while (end >= start) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(index == -1 ? "Element not found" : "Element found on index " + index);
    }
}
