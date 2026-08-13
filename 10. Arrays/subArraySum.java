import java.util.Scanner;

public class subArraySum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at position: " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int targetSum = sc.nextInt();

        int count = 0;

        for(int i = 0; i<size; i++){
            int sum = 0;
            for(int j = i; j<size; j++){
                sum += arr[j];
                if(sum == targetSum){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
