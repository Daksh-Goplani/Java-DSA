import java.util.Scanner;

public class start {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i< size; i++){
            System.out.print("Enter value for position " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Elements are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
