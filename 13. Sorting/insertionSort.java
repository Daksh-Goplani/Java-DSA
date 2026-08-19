import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        
        int arr[] = {5,4,3,2,1};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void InsertionSort(int[] arr){

        int n = arr.length;

        for(int i = 1; i<n; i++){
            int key = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev]>key){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev +1] = key;
        }

    }
}
