import java.util.Scanner;

public class goodMorning {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your gender: ");
        char gender = sc.next().charAt(0);

        if(gender == 'M')
            System.out.println("Good morning Sir");
        else
            System.out.println("Good morning Mam");
    }
}
