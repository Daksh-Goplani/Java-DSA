class Solution {
    public int missingNumber(int[] arr) {
        int i = 0;
        int ans = arr.length;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] == i || arr[i]>=arr.length) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }

        for(int k = 0; k<arr.length; k++){
            if(k != arr[k]){
                ans = k;
                break;
            }
        }
    return ans;
    }
}