import java.util.InputMismatchException;
import java.util.Scanner;

public class subtract {

    public Scanner input = new Scanner(System.in);
    public Double num1 ,num2;
    public Double result;

    public void subtraction() {
        boolean a = true;
        while (a) {
            System.out.println("Subtraction :");
            try {
                System.out.println("Enter the first number :");
                num1 = input.nextDouble();
                System.out.println("Enter the second number :");
                num2 = input.nextDouble();

                result = num1 - num2;
                System.out.println(result);  
                a=false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid :");
                input.next();
            }

        }

    }
}