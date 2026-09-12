class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        int count = 2;
        for(int i = 2; i<n; i++){
            for(int j = 2; j <= i/2; j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
        }
        return n - count;
    }
}