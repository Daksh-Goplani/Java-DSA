public class SkipChar {
    public static void main(String[] args) {
        skip("", "baccads");
        System.out.println(skip2( "baccads"));
    }

    static void skip(String p, String up){ // Processed & Unprocessed
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));
        }
        else{
            skip(p + ch , up.substring(1));
        }
    }

    static String skip2(String up){ // Unprocessed
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip2(up.substring(1));
        }
        else{
            return ch + skip2(up.substring(1));
        }
    }
}
