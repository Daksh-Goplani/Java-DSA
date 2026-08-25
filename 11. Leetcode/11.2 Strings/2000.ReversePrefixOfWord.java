class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index == -1){
            return word;
        }
        char arr[] = word.toCharArray();
        int i = 0;
        while(index>=i){
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            index--;
            i++;
        }
        String ans = new String(arr);
        return ans;
    }
}