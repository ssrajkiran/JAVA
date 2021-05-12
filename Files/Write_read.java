
import java.util.Scanner;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.nio.file.NoSuchFileException;



public class Write_read {

    public static Scanner input = new Scanner(System.in);

    public static void main(String [] args)throws IOException{

        try{
        System.out.println("Enter file to read:");
        String filename = input.nextLine();
        Path path =Paths.get(filename);
        if(!Files.exists(path)){
            System.out.println("File doesn't exists");
            
        }else {

            System.out.println("Enter the text to save:");
            String text = input.nextLine();

            Files.write(path ,(text + System.lineSeparator()).getBytes (StandardCharsets.UTF_8),StandardOpenOption.APPEND);
            System.out.println("Written successful");
        }
        String content = new String (Files.readAllBytes(path));
        System.out.println(content);
        
        }catch (NoSuchFileException e){
            System.out.println("Note : File name with extension!!!");

        }
        

        

        

}
}