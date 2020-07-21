import java.util.Scanner;
//import java.lang.Math;

public class Power {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int result = 1;

        System.out.println("Enter the number:");
        int n = input.nextInt();
        System.out.println("Enter the power of a number:");
        int p = input.nextInt();
        // System.out.println(Math.pow(n, p));
        for (int i = p; i != 0; --i) {
            result = result * n;
        }
        System.out.println(result);

    }
}