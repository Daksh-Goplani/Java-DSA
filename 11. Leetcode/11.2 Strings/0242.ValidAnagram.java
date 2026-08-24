class Solution {
    public boolean isAnagram(String s, String t) {
        int frequencyS[] = new int[26];
        int frequencyT[] = new int[26];

        for(char ch : s.toCharArray()){
            frequencyS[ch - 'a']++;
        }

        for(char ch : t.toCharArray()){
            frequencyT[ch - 'a']++;
        }

        for(int i = 0; i<frequencyS.length; i++){
            if(frequencyS[i] != frequencyT[i]){
                return false;
            }
        }
        return true;
    }
}