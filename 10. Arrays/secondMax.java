import java.util.Scanner;

public class secondMax {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at position: " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        int index = Integer.MIN_VALUE;

        for(int i = 0; i<size; i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
                index = i-1;
            }
            else if(arr[i]>secondMax){
                secondMax = arr[i];
                index = i;
            }
        }   
        System.out.println(secondMax + " " + index);
    }
}
