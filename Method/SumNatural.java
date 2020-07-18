import java.util.Scanner;

public class SumNatural {
    static Scanner input = new Scanner(System.in);

    static void print(int a, int b) {
        int sum = 0;
        while (a <= b) {
            sum = sum + a;
            a++;
        }
        System.out.println("Sum of natural numbers:" + sum);

    }

    public static void main(String[] args) {
        System.out.println("Enter start number:");
        int start = input.nextInt();
        System.out.println("Enter end number:");
        int end = input.nextInt();
        print(start, end);
    }
}