import java.util.ArrayList;

public class linearSearchAll {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 5 };
        search(arr, 3, 0);
        System.out.println(list);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    public static int search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return search(arr, target, index + 1);
    }
}
