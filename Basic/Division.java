
import java.util.Scanner;

public class Division {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter two numbers of division:");
        String a = input.nextLine();
        String b = input.nextLine();
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);

        try {
            int quotient = (a1/b1);
            int Remainder =(a1%b1);
            System.out.println("Quotient: "+quotient);
            System.out.println("Remainder : "+Remainder);
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}