import java.util.Scanner;

public class Patternthree
{
    static Scanner input = new Scanner(System.in);
    public static void main(String [] args)
    {
        System.out.println("Enter no of times to flow (Patternthree):");
        int n = input.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=0;k--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}