class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len = Math.min(word1.length(), word2.length());
        StringBuilder ans = new StringBuilder("");
        for(int i = 0; i<len; i++){
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
        }
        if(word1.length()> len){
            ans.append(word1.substring(len, word1.length()));
        }
        if(word2.length()> len){
            ans.append(word2.substring(len, word2.length()));
        }
        return ans.toString();
    }
}