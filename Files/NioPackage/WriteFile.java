
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;




public class WriteFile
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)throws IOException
    {
        String file = "Filename";
        Path path = Paths.get(file);
        if(!Files.exists(path))
        {
            System.out.println("File is not exists:");
        }
        else
        {

            System.out.println("your file exists:");
            System.out.println("Enter the input to store:");
            String write =input.nextLine();
            
            Files.write(path,(write + System.lineSeparator()).getBytes(StandardCharsets.UTF_8),StandardOpenOption.APPEND);
            System.out.println("Your inputs successfully written:");
           
        }
    }
}