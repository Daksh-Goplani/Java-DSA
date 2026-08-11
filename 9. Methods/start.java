public class start {

    public void print(String msg){
        System.out.println(msg);
    }

    public static int sum(int a , int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sum(2,3));

        start obj = new start();
        obj.print("Hello");

    }
}
