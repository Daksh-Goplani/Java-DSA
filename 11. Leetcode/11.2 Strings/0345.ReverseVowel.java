class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] arr = s.toCharArray();
        while(j>=i){
            if ("aeiouAEIOU".indexOf(arr[i]) == -1) {
                i++;
            } else if ("aeiouAEIOU".indexOf(arr[j]) == -1) {
                j--;
            } else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        String s1 = new String(arr);
        return s1;
    }
}