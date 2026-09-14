class Solution {
    public String replaceDigits(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int shift = ch - '0';
                ans.append((char)(s.charAt(i - 1) + shift));
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}