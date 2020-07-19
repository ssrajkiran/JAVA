
import java.util.Scanner;

public class CompoundInterest {
    static Scanner input = new Scanner(System.in);

    public void calculate(int p, Double r, int t,int n ) {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: " + cinterest);
        System.out.println("Amount after " + t + " years: " + amount);

    }

    public static void main(String[] args)
    {
        System.out.println("Enter the principle amount:");
        int p = input.nextInt();
        System.out.println("Enter annual rate interest:");
        Double r =input.nextDouble();
        System.out.println("Enter no of times:");
        int n = input.nextInt();
        System.out.println("Enter the time of interest:");
        int t=input.nextInt();
        CompoundInterest ob1 = new CompoundInterest();
        ob1.calculate(p, r, n, t);

    }
}