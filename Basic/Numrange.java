import java.io.*;

class Numrange
{
    public static void main(String args[])throws Exception
{
    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader dr = new BufferedReader(r);

    System.out.println("Enter your starting number:");
    int start = Integer.parseInt(dr.readLine());
    System.out.println("Enter your ending number:");
    int end = Integer.parseInt(dr.readLine());

    for(int i=start;i<=end;i++)
    {
        System.out.println("Your number:" +i);
    }
}}