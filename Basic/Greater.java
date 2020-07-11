import java.io.*;

public class Greater
{
   static InputStreamReader r = new InputStreamReader(System.in);

        public static void main(String args[])throws Exception
            {
        
                 BufferedReader input = new BufferedReader(r);

                  System.out.println("To find greatest number:");

                  System.out.println("Enter 1st number:");
                     int a = Integer.parseInt(input.readLine());

        System.out.println("Enter 2nd number:");
        int b = Integer.parseInt(input.readLine());

        int GreatestNumber = (a > b)? a:b;
        System.out.println("Your greatest number is :"+GreatestNumber);
    }
}