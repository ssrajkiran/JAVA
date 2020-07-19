import java.util.Scanner;
public class Palindrome {
    static Scanner input = new Scanner (System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter any number:");
        int number= input.nextInt();
        int copy = number;
        int rev=0;
        int remainder;
        while(number!=0)
        {
            remainder = number % 10;
            rev = rev* 10+remainder;
            number /=10;
        }
        //Integer.reverse(number);
        
        System.out.println(rev);
        if(copy==rev)
        {
            System.out.println("It is a palindrome number:");
        }
        else
        {
            System.out.println("It is not a palindrome number:");
        }
    }    
}