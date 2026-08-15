public class minArray {
    public static void main(String[] args) {
        int arr[] = {435,63,23,7,2,-123};
        System.out.println(minimum(arr));
    }

    static int minimum(int[] arr){
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
