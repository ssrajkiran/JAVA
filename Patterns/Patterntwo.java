
import java.util.Scanner;

public class Patterntwo {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter no of times to flow(Pattern two):");
        int n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}