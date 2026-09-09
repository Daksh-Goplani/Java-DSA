class Solution {
    public long countCommas(long n) {
        long ans = 0, threshold = 1000;
        while(n>=threshold){
            ans += (n - threshold + 1);
            threshold *= 1000;
        }
        return ans;
    }
}