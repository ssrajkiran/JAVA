import java.util.Scanner;

public class PositiveNegative {

    static Scanner input = new Scanner (System.in);
    static void check(float a)
    {
        if(a<0.0)
        {
            System.out.println("Negative number:");
        }
        else{
            System.out.println("Positive number:");
        }

    }
     public static void main(String[] args) {
         

         System.out.println("Enter the number:");
         String number =input.nextLine();
        float a =Float.parseFloat(number);
        check(a);
        

        
    }
}