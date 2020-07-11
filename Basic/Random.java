import java.io.*;

public class Random
{
    double x;
    public static void main(String [] args)throws Exception
    {
        System.out.println("Random number:");
        int x = (int) (Math.random()*50);
        if(x%2==0)
        {
        System.out.println("Random number is a even number:" +x);
        }
        else if (x%2!=0)
        {
            System.out.println("Random number is a odd number:" +x);
        }
        else
        {
            System.out.println("Random number is either even nor odd:" +x);
        }
    }
}