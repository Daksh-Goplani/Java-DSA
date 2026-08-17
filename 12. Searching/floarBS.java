public class floarBS {
    public static void main(String[] args) {

        int arr[] = {2, 3, 5, 9, 14, 16, 18};

        int target = 8;

        int start = 0, end = arr.length -1, mid;

        while (end >= start) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                end = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(end);
    }
}
