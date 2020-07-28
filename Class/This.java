import java.util.Scanner;

public class This
{
    public int n =10;
    static Scanner input = new Scanner (System.in);

    This(int n)
    {
        this.n = n;
    }
    void display()
    {
        System.out.println(n);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter any number");
        int n= input.nextInt();
        This s1 = new This(n);
        s1.display();
        
    }
}