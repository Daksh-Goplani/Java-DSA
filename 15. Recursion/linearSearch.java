public class linearSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int index = search(arr, 9, 0);
        System.out.println(index);
    }

    public static int search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return search(arr, target, index + 1);
    }
}
