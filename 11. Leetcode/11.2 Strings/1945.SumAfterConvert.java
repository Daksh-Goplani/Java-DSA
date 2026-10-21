class Solution {
    public int getLucky(String s, int k) {
        
        StringBuilder sb = new StringBuilder("");
        for(char c : s.toCharArray()){
            int position = c - 'a' + 1;
            sb.append(position);
        }
        String numStr = sb.toString();

        int currentSum = 0;
        for(int i = 0; i<k;i++){
            currentSum = 0;
            for(int j = 0; j<numStr.length(); j++){
                currentSum += numStr.charAt(j) - '0';
            }
            numStr = String.valueOf(currentSum);
        }
        return currentSum;
    }
}