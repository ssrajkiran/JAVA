import java.util.Scanner;
public class Factorial {
    static Scanner input = new Scanner (System.in);
    public static void main(String[]args)
    {
        System.out.println("Enter starting number of it ");
        int start =input.nextInt();
        System.out.println("Enter ending number:");
        int end = input.nextInt();
        int fact=1;
        while(start<=end)
        {
            fact =fact*start;
            start++;
        }
        System.out.println("Factorial of a range is:" +fact);
    }    
}