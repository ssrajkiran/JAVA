import java.util.Scanner;

public class checkInt
{
    static Scanner userinput = new Scanner(System.in);

        public static void main(String [] args)
        {
            
            System.out.println("Enter the number:");
            
            if(userinput.hasNextInt())
            {
                int a = userinput.nextInt();
                System.out.println("Your entered number is :"+a);
            }
            else
            {
                System.out.println("Next time enter integer number:");
            }
        }
}