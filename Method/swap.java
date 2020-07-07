import java.io.*;
class swap
{
    static void swap(int x,int y)
    {
        int temp;
        temp = x;
        x=y;
        y=temp;
        System.out.println(+x,+y);
    }
    public static void main(String args[])throws Exception
    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader input = BufferedReader(r);

    System.out.println("Swapping numbers:");
    System.out.println("Enter 1st number:");
    int a = Integer.parseInt(input.readLine());

    System.out.println("Enter 2nd number:");
    int b=Integer.parseInt(input.readLine());
    System.out.println("Before swap:")
    swap();
}