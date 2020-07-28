import java.util.Scanner;
public class Addstatic {
    static Scanner input = new Scanner (System.in);
    static 
    {
        System.out.println("-------------");
        System.out.println("Static method is running:");
        System.out.println("Addition :");
        System.out.println("Static method end");
        System.out.println("-------------");
    }
    public static void main(String[] args)
    {
        System.out.println("Enter 1st number:");
        int  a =input.nextInt();
        System.out.println("Enter 2nd number:");
        int b = input.nextInt();
        int c =a+b;
        System.out.println("Addition :" +c);
    }
}