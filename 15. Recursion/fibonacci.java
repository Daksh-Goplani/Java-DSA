public class fibonacci {
    public static void main(String[] args) {
        int num = 8;
        for (int i = 0; i < num; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    public static int fibo(int n){
        if(n == 1 || n == 0){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
