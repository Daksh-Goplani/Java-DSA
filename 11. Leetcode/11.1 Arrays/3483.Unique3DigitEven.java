class Solution {
    public int totalNumbers(int[] digits) {
        int frequency[] = new int[10];
        int ans = 0;
        for(int i = 0; i<digits.length; i++){
            int num = digits[i];
            frequency[num]++;
        }

        for(int i = 100; i<999;i+=2){
            int u = i%10;
            int t = (i/10) % 10;
            int h = i/100;

            int ansFrequency[] = new int[10];
            ansFrequency[u]++;
            ansFrequency[t]++;
            ansFrequency[h]++;

            if(frequency[u]>=ansFrequency[u] && frequency[t]>=ansFrequency[t] && frequency[h]>=ansFrequency[h]){
                ans++;
            }
        }
        return ans;
    }
}