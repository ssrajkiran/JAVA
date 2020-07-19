import java.util.Scanner;
public class SimpleInterest
{
    static Scanner input = new Scanner(System.in);
    public void calcuate(int p,int n,int r)
    {
        double sinterest = (p*n*r)/100;
        System.out.println("Simple Interest:" +sinterest);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter principle amount:");
        int p = input.nextInt();
        System.out.println("Enter the no of interest:");
        int n = input.nextInt();
        System.out.println("Enter the rate of interest:");
        int r = input.nextInt();
        SimpleInterest ob1 = new SimpleInterest();
        ob1.calcuate(p,n,r);
    }
}