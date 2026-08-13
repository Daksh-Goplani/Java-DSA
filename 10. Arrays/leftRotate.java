import java.util.Arrays;
import java.util.Scanner;

public class leftRotate {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at position: " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];

        for(int i = 0; i<size-1; i++){
            arr[i] = arr[i+1];
        }
        arr[size-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
