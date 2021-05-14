import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static int choice;
    public static String yes;

    public static add c = new add();
    public static subtract v = new subtract();
    public static Multiple q = new Multiple();
    public static Divide r = new Divide();

    public static void main(String[] args) {
        boolean a = true;
        System.out.println("Calculator :");
        System.out.println("1.ADD \t 2.SUBTRACT \t 3.MULTIPLICATION \t 4. DIVISION ");
        while (a) {
            try {
                System.out.print("Enter choice : ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        c.addition();
                        break;
                    case 2:
                        v.subtraction();
                        break;
                    case 3:
                        q.multiplication();
                        break;
                    case 4:
                        r.division();
                        break;
                    default:
                        System.out.println("Unvalid");

                }

                a = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid");
                input.next();
            }
        }

    }

}
