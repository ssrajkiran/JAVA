import java.util.Scanner;
import java.util.InputMismatchException;
 class AgeError
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {

        System.out.println("Enter your age:");
        
        CheckValidAge();
    }

    public static void CheckValidAge()
    {
        try
        {
            int age = input.nextInt();
            System.out.println("Your age is :"+age);
        
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter whole number.");
        }
        catch(Exception e)
        {
            System.out.println(e);
        
     }
    }

}