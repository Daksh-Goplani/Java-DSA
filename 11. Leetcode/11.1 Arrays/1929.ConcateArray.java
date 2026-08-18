class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr2[] = new int[nums.length *2];
        int j = 0;
        for(int i = 0; i<arr2.length; i++){
            arr2[i] = nums[j];
            j++;
            if(j==nums.length){
                j=0;
            }
        }
        return arr2;
    }
}