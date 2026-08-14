/* 
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0, end = nums.length - 1;
        int arr[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                arr[end--] = 0;
            }
            else{
                arr[start++] = nums[i];
            }
        }

        for(int i = 0; i<nums.length;i++){
            nums[i] = arr[i];
        }
    }
}