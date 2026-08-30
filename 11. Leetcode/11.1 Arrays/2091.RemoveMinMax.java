class Solution {
    public int minimumDeletions(int[] arr) {
        int maxIndex = 0, minIndex = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[maxIndex] < arr[i]){
                maxIndex = i;
            }
            if(arr[minIndex] > arr[i]){
                minIndex = i;
            }
        }
        
        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);

        int removeBothFront = right + 1;
        int removeBothBack = arr.length - left;
        int removeBothSides = (left + 1) + (arr.length - right);

        return Math.min(removeBothFront, Math.min(removeBothBack, removeBothSides));
        
    }
}