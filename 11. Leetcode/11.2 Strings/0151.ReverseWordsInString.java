class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        // String ans = words[words.length - 1];
        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);
            if (i > 0) {
                ans.append(" "); // Add space between words
            }
        }
        return ans.toString();
    }
}