public class sumNatural {
    public static void main(String[] args) {
        int ans = 0;
        sum(5, ans);
    }

    public static void sum(int num, int ans){
        if(num == 0){
            System.out.println(ans);
            return;
        }
        ans += num;
        sum(num-1, ans);
    }
}