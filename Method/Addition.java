import java.io.*;


public class Addition
{
    static void fun(int x,int y)
    {
        int w=x+y;
        System.out.println("Your addition is:" +w);
    }
    static void fun(int x,int y,int z)
    {
        int s=x+y+z;
        System.out.println("Your addition is:"+s);
    }
    static void fun(int x,int y,int z,int v)
    {
        int a=x+y+z+v;
        System.out.println("Your addition is:"+a);
    }
    public static void main(String args[])throws Exception
    {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(r);
        System.out.println("Enter how many numbers you want to add(upto 4 number):");
        int number = Integer.parseInt(input.readLine());

        if(number==1)
        {
            System.out.println("Your answer is:"+number);
        }
        if(number==2)
        {
            System.out.println("Enter first number:");
            int a = Integer.parseInt(input.readLine());
            System.out.println("Enter second number:");
            int b =Integer.parseInt(input.readLine());

            fun(a,b);
        }
        if(number==3)
        {
             System.out.println("Enter first number:");
            int a = Integer.parseInt(input.readLine());
            System.out.println("Enter second number:");
            int b =Integer.parseInt(input.readLine());
             System.out.println("Enter third number:");
            int c = Integer.parseInt(input.readLine());
           
            fun(a,b,c);
        }
        if(number==4)
        {
             System.out.println("Enter first number:");
            int a = Integer.parseInt(input.readLine());
            System.out.println("Enter second number:");
            int b =Integer.parseInt(input.readLine());
             System.out.println("Enter third number:");
            int c = Integer.parseInt(input.readLine());
            System.out.println("Enter forth number:");
            int d =Integer.parseInt(input.readLine());

            fun(a,b,c,d);
        }
        if(number>4)
        {
            System.out.println("Upto only 4 numbers not more than that...");
        }
        
    }
}