import java.util.Scanner;

class Add
{
    public static void main(String [] args)
    {
        int sum;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value");
        int a = input.nextInt();

        System.out.print("Enter b value");
        int b = input.nextInt();
        sum= a+b;
        
        System.out.println("Total: "+ sum);
        input.close();
    }

}