// x^n
// Stack height: n

public class power {
    public static void main(String[] args) {
        int ans = calPower(2, 5);
        System.out.println(ans);
    }

    public static int calPower(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int xPownm1 = calPower(x, n-1); // x power n-1
        int xPown = x * xPownm1; // x power n
        return xPown;
    }
}