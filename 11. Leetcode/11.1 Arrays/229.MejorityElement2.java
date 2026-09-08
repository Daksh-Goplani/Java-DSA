import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        int range = nums.length/3;
        int ans = 1;
        for(int i = 0; i< nums.length; i++){
            if(i<nums.length - 1 && nums[i] == nums[i + 1]){
                ans++;
            } else{
                if(ans > range){
                    result.add(nums[i]);
                }
                ans = 1;
            }
        }
        return result;
    }
}