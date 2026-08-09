import java.util.Scanner;

public class rotatedHalfPyramid {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<=rows; j++){
                if(j>rows-i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
