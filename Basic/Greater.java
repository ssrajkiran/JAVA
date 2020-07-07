import java.io.*;

class Greater
{
    public static void main(String args[])throws Exception
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(r);

        System.out.println("To find greatest number:");

        System.out.println("Enter 1st number:");
        int a = Integer.parseInt(input.readLine());

        System.out.println("Enter 2nd number:");
        int b = Integer.parseInt(input.readLine());

        if(a>b)
        {
            System.out.println("Greatest number is:"+a);
        }
        else
        {
            System.out.println("Greatest number is:"+b);
        }
    }
}