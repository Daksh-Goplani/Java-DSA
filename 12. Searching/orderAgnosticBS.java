public class orderAgnosticBS {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,7,8,9};
        int ans = OrderAgnosticBS(arr, 8);
        System.out.println(ans);

    }

    static int OrderAgnosticBS(int arr[], int target) {

        int start = 0, end = arr.length - 1, mid;

        boolean isAsc = arr[start] < arr[end];

        while (end >= start) {
            mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            else{
                if(arr[mid] < target){
                    end = mid -1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
