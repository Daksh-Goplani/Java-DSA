public class prime {
    public static void main(String[] args) {
        int num = 7, count = 0;

        for(int i = 2; i<num; i++){
            if(num%i==0){
                count++;
            }
        }
        System.out.println(count == 0 ? "Prime" : "Not prime");
    }
}
