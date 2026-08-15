// Given an array nums of integers, return how many of them contain an even number of digits.

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            int check = nums[i];
            int countDigit = 0;
            while(check>0){
                check /= 10;
                countDigit++;
            }
            if(countDigit%2 == 0){
                count++;
            }
        }

        return count;
    }
}

class Solution2 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            // int check = nums[i];
            int countDigit = (int)(Math.log10(nums[i])) + 1;
            if(countDigit%2 == 0){
                count++;
            }
        }

        return count;
    }
}