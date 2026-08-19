import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows= sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter value at matrix of [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
