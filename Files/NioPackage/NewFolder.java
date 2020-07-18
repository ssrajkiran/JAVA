import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class NewFolder
{
    static Scanner input = new Scanner (System.in);
    public static void main(String[] args)throws IOException
    {
        System.out.println("Enter folder name:");
        String filepath = input.nextLine();
        Path path =Paths.get(filepath);
        if(Files.exists(path))
        {
            System.out.println("Your file already exists:");
        }
        else
        {
            Files.createDirectory(path);
            System.out.println("Your folder is created:");
        }
    }
}