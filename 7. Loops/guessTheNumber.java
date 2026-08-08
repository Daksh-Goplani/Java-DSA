import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int RandomNum = (int)((Math.random()*100)+1);
        int guess = 0;

        do{
            System.out.print("Guess the number b/w 0-100: ");
            guess = sc.nextInt();
            if(guess == RandomNum){
                System.out.println("Congrats! You win");
            }
            else if(guess > RandomNum){
                System.out.println("Guess a lower num");
            }
            else{
                System.out.println("Guess higher num");
            }
        }while(guess!=RandomNum);
    }
}
