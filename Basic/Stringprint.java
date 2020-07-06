import java.io.*;

class Stringprint
{
    public static void main(String args[])throws Exception
{
   InputStreamReader r =new InputStreamReader(System.in);
    BufferedReader dr =new BufferedReader(r);

    System.out.println("Enter Your Name:");
    String name = dr.readLine();

    System.out.println("Welcome "+name);
}}