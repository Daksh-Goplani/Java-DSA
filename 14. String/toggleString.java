import java.util.Arrays;

public class toggleString {
    public static void main(String[] args) {

        String s = "HeLlO";
        char arr[] = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch >= 'a' && ch <= 'z') {
                arr[i] = (char) (arr[i] - 32);
            } else {
                arr[i] = (char) (arr[i] + 32);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
