import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int flag = -1;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at position: " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target elem: ");
        int target = sc.nextInt();

        for(int i = 0; i<size; i++){
            if(arr[i] == target){
                flag = i;
                break;
            }
        }
        System.out.println(flag);

    }
}
