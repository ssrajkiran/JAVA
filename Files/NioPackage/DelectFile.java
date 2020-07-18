import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DelectFile {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)throws IOException
    {
        String filename = "Filename";
        Path path =Paths.get(filename);
        if(!Files.exists(path))
        {
            System.out.println("File is not found on the system:");
        }
        else
        {
            System.out.println("Are you sure want to delect the file:1.Yes 2.No");
            int n = input.nextInt();
            if(n==1)
        {
            Files.delete(path);
            System.out.println("Your file is delected:");
        }
    }
        
    }    
}