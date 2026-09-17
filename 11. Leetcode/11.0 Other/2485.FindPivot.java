class Solution {
    public int pivotInteger(int n) {
        int start = 0, end = n;
        int totalSum = n * (n + 1) / 2;
        while(start<=end){
            int mid = start + (end - start) / 2;
            int leftSum = mid * (mid + 1) / 2;
            int rightSum = totalSum - (mid - 1) * mid / 2;
            if (leftSum == rightSum) {
                return mid;
            } else if (leftSum < rightSum) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}