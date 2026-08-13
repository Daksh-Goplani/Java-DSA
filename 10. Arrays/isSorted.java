import java.util.Scanner;

public class isSorted {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int flag = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at position: " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<size-1; i++){
            if(arr[i]<arr[i+1]){
                continue;
            }
            else{
                flag = -1;
            }
        }
        if(flag == 0){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not sorted");
        }
    }
}
