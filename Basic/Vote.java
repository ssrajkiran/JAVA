import java.io.*;

public class Vote
{
    static InputStreamReader r = new InputStreamReader(System.in);
    

        public static void main(String[] args)throws Exception
        {
            BufferedReader input = new BufferedReader(r);
            System.out.println("Enter your age:");
            int age = Integer.parseInt(input.readLine());
            if(age > 18)
            {
                System.out.println("You will be vote.");
            }
            else
            {
                System.out.println("You will not vote.");
            }
        }
}