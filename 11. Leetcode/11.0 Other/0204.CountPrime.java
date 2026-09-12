// Time limit exceed in submission as of O(n^2) complexity
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

// Optimized:
class Solution2 {
    public int countPrimes(int n) {
        if(n<2) return 0;

        int count = 0;

        boolean isPrime[] = new boolean[n];
        for(int i = 2; i<n ; i++){
            isPrime[i] = true;
        }

        for(int i = 2; i* i <n; i++){
            if(isPrime[i]){
                for(int j = i*i; j<n;j+=i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i = 2; i<n; i++){
            if(isPrime[i]) count++;
        }

        return count;
    }
}