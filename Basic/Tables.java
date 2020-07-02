import java.util.Scanner;
class Tables
{
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        int table,times;
        System.out.print("Enter table no:");
        table = input.nextInt();

        System.out.print("Enter times:");
        times = input.nextInt();

        for(int i=0;i<times;i++)
        {
            System.out.println(table+" * "+i+" = "+table*i);
        }
        
    }

}