import java.io.*;

class Input
{
    public static void main(String args[])throws Exception
    {
    InputStreamReader r =new InputStreamReader(System.in);
    BufferedReader br =new BufferedReader(r);

    System.out.println("Enter your name:");
    String name =br.readLine();
    

    System.out.println("Enter your age:");
    int age=Integer.parseInt(br.readLine());
    

    System.out.println("Enter your id:");
    int id =Integer.parseInt(br.readLine());
    

    System.out.println("Your name is:"+name);
    System.out.println("Your age is:"+age);
    System.out.println("Your id is:"+id);
    }


}