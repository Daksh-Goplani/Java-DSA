class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[] = new int[2];

        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else{
                i++;
            }
        }
        for(int k = 0; k<nums.length; k++){
            if(nums[k] != k + 1){
                arr[0] = nums[k];
                arr[1] = k+1;
                break;
            }
        }
        return arr;
    }
}