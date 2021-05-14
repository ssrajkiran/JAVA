import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiple {
    public static Scanner input = new Scanner(System.in);
    public static int sum = 1;

    public void multiplication() {

        boolean a = true;

        while (a) {
            System.out.println("MULTLIPLICATION :");
            try {

                System.out.println("Enter how many number you want to multiply :");
                int c = input.nextInt();

                int[] intArray = new int[c];
                for (int i = 0; i <c; i++) {
                    System.out.println("Enter number " + i + ":");
                    intArray[i] = input.nextInt();
                }

                for (int j = 0; j <c; j++) {
                    sum = sum * intArray[j];
                }
                System.out.println("Total : " + sum);
                a = false;

            } catch (InputMismatchException e) {
                System.out.println("Invalid :");
                input.next();
            }

        }
    }

}
