public class eachChar {
    public static void main(String[] args) {
        
        String s = "Hello";

        for(int i = 0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }

        for(char ch : s.toCharArray()){
            System.out.println(ch);
        }
    }
}
