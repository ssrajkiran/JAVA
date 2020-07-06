import java.io.*;

class Add
{
    public static void main(String args[])throws Exception
    {
        InputStreamReader r =new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);        
        
        System.out.println("Addition of number:");

        System.out.println("Enter one number:");
        int a=Integer.parseInt(br.readLine());

        System.out.println("Enter second number:");
        int b = Integer.parseInt(br.readLine());
        int c =a+b;
        System.out.println("Your Output is :" +c);
   }

}