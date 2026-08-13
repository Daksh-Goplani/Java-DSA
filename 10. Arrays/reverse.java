import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at position: " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // n steps
        // for (int i = size - 1; i >= 0; i--) {
        //     System.out.print(arr[i] + " ");
        // }

        // More optimized... need n/2 steps
        int start = 0, end = size -1; 
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
