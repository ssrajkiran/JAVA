import java.util.InputMismatchException;
import java.util.Scanner;

public class add {
    public static Scanner input = new Scanner(System.in);
    public static Double sum = 0.0;

    public void addition() {

        boolean a = true;

        while (a) {
            try {

                System.out.println("Enter how many number you want to add :");
                int c = input.nextInt();

                Double[] intArray = new Double[c];
                for (int i = 0; i <c; i++) {
                    System.out.println("Enter number " + i + ":");
                    intArray[i] = input.nextDouble();
                }

                for (int j = 0; j <c; j++) {
                    sum = sum + intArray[j];
                }
                System.out.println("Total : " + sum);
                System.out.println("Roundvalue : " + Math.round(sum));
                a = false;

            } catch (InputMismatchException e) {
                System.out.println("Invalid :");
                input.next();
            }

        }
    }

}
