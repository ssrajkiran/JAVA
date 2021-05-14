import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {
    public Scanner input = new Scanner(System.in);

    public void division() {
        boolean a = true;
        System.out.println("DIVIDE :");
        while (a) {
            try {
                System.out.println("Enter number 1 :");
                int num = input.nextInt();
                System.out.println("Enter number 2 :");
                int num2 = input.nextInt();

                int result = num / num2;
                System.out.println("Divide of two number :" +result);
                a=false;

            } 
            catch (InputMismatchException e) {
                System.out.println("Invalid");
                input.next();
            }
            catch(ArithmeticException e){
                System.out.println("Input invalid :");
          
            }

        }

    }
}
