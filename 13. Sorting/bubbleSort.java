import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {

        int arr[] = { 4, 62, 6, 3, 98, 2, 75, 9 };
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr) {
        int temp;
        
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;
            // for (int j = 0; j < arr.length - 1; j++) {
            for (int j = 0; j < arr.length - 1 - i; j++) { // More optimized
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }
}
